import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RegistrationPage;
import settings.ChromeDriverSettings;

public class RegistrationTest extends ChromeDriverSettings {

    @Test(description = "Test will perform success registration and will perform change of first name and last name")
    public void RegistrationSuccessTest() {

        final String firstName = "FirstName";
        final String lastName = "LastName";
        final String code = "+965";
        final String phoneNumber = "1112233";
        final String email = "qwerty@gmail.com";
        final String password = "1234567890";

        final String changeFirstName = "Low";
        final String changeLastName = "Bob";

        final RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        final LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        final AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
        final DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        /*
         * Registration
         */
        registrationPage.openRegistrationPage();
        registrationPage.accountRegistration(firstName, lastName, code, phoneNumber, email, password);
        dashboardPage.checkUrl();
        /*
         * Login
         */
        loginPage.openLoginPage();
        loginPage.loginUsingPhone(code, phoneNumber, password);
        dashboardPage.checkUrl();
        accountPage.openAccountPage();
        /*
         * Verification of user data after registration
         */
        String actualFirstName = accountPage.getFirstName();
        String actualLastName = accountPage.getLastName();
        String actualEmail = accountPage.getEmail();
        String actualPhoneNumber = accountPage.getPhoneNumber();
        Assert.assertEquals(actualFirstName, firstName);
        Assert.assertEquals(actualLastName, lastName);
        Assert.assertEquals(actualEmail, email);
        Assert.assertEquals(actualPhoneNumber, code + " " + phoneNumber);
        /*
         * Change of first name and last name
         */
        accountPage.openAccountPage();
        accountPage.editFirstAndLastName(changeFirstName, changeLastName);
        accountPage.waitEditButton();
        /*
         * Verifying user data after changes
         */
        String actualChangedFirstName = accountPage.getFirstName();
        String actualChangedLastName = accountPage.getLastName();
        Assert.assertEquals(actualChangedFirstName, changeFirstName);
        Assert.assertEquals(actualChangedLastName, changeLastName);
    }
}
