package api;


import api.client.APIClient;
import api.model.Authorization;
import api.model.Registration;
import api.model.UserInfo;
import api.service.AuthorizationService;
import api.service.RegistrationService;
import api.service.UpdateUserService;
import api.service.UserService;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import util.InviteCode;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;

public class PreprodApiTest {

   private final Registration registrationData = new Registration();
   private final Authorization authorizationData = new Authorization();
   private Retrofit retrofit;

    @BeforeTest
    public void SetUp(){

        //Data
        registrationData.setId("");
        registrationData.setFirstName("Low");
        registrationData.setLastName("Bob");
        registrationData.setFullName("");
        registrationData.setEmail("cccc@mail.ru");
        registrationData.setCountryDiallingCode("965");
        registrationData.setPhoneNumber("5353535666666");
        registrationData.setPassword("12345");
        registrationData.setInviteCode(InviteCode.getCurrentInviteCode());
        registrationData.setRole("d7ae2711-924a-4141-ac69-23e5e94d6102");

        authorizationData.setEmail("cccc@mail.ru");
        authorizationData.setPassword("12345");

        //Client
        retrofit = APIClient.getClient();

    }

    @Test(description = "Test will perform success api registration and will perform change of first name and last name")
    public void ApiTest() throws IOException {

        //Registration
        RegistrationService service = retrofit.create(RegistrationService.class);
        Response<Registration> registrationRequestResponse = service.registration(registrationData).execute();

        //Checking registration
        int registrationSuccessCode = registrationRequestResponse.code();
        boolean successfulRegistration = registrationRequestResponse.isSuccessful();
        Assert.assertTrue(successfulRegistration);
        Assert.assertEquals(HttpsURLConnection.HTTP_OK, registrationSuccessCode);

        //Authorization
        AuthorizationService authorizationService = retrofit.create(AuthorizationService.class);
        Response<Authorization> authRequestResponse = authorizationService.authentication(authorizationData).execute();

        //Received X-Authorization token
        final String token = authRequestResponse.headers().get("set-cookie").substring(16, 181);

        //Checking user data after registration
        UserService userService = retrofit.create(UserService.class);
        Response<UserInfo> userInfoResponse = userService.getUserInfo(token).execute();
        String actualFirstName = userInfoResponse.body().getFirstName();
        String actualLastName = userInfoResponse.body().getLastName();
        String actualEmail = userInfoResponse.body().getEmail();
        String actualCountryDiallingCode = userInfoResponse.body().getCountryDiallingCode();
        String actualPhoneNumber = userInfoResponse.body().getPhoneNumber();
        Assert.assertEquals(actualFirstName, registrationData.getFirstName());
        Assert.assertEquals(actualLastName, registrationData.getLastName());
        Assert.assertEquals(actualEmail, registrationData.getEmail());
        Assert.assertEquals(actualCountryDiallingCode, registrationData.getCountryDiallingCode());
        Assert.assertEquals(actualPhoneNumber, registrationData.getPhoneNumber());

        //Getting user id
        String userId = userInfoResponse.body().getId();

        //Changing user data
        UserInfo userInfo = userInfoResponse.body();
        userInfo.setFirstName("#@!#^%&^");
        userInfo.setLastName("#@!#^%&^");

        //User data update
        UpdateUserService updateUserService = retrofit.create(UpdateUserService.class);
        Response<UserInfo> update = updateUserService.update(userId, token, userInfo).execute();
        boolean successfulUpdate = update.isSuccessful();
        int updateSuccessCode = update.code();
        String actualUpdatedFirstName = update.body().getFirstName();
        String actualUpdatedLastMame = update.body().getLastName();

        Assert.assertEquals(updateSuccessCode, HttpsURLConnection.HTTP_CREATED);
        Assert.assertTrue(successfulUpdate);

        //Checking user data after update
        Assert.assertEquals(actualUpdatedFirstName, userInfo.getFirstName());
        Assert.assertEquals(actualUpdatedLastMame, userInfo.getLastName());

    }

}
