package api.service;


import api.model.Registration;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegistrationService {

    @POST("enterprise-web/user")
    Call<Registration> registration(@Body Registration user);
}
