import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import pages.RegistrationPage;
import settings.ChromeDriverSettings;

public class RegistrationTest extends ChromeDriverSettings {

    @Test(description = "Test will perform success registration and will perform change of first name and last name")
    public void RegistrationSuccessTest() {

        final String firstName = "FirstName";
        final String lastName = "LastName";
        final String code = "+965";
        final String phoneNumber = "77711336";
        final String email = "qwerty@gmail.com";
        final String password = "1234567890";

        final String changeFirstName = "Low";
        final String changeLastName = "Bob";

        final RegistrationPage registrationPage = new RegistrationPage(driver);
        final LoginPage loginPage = new LoginPage(driver);
        final AccountPage accountPage = new AccountPage(driver);
        final WebDriverWait wait = new WebDriverWait(driver, 10);

        /*
         * Registration
         */
        registrationPage.openRegistrationPage();
        registrationPage.accountRegistration(firstName, lastName, code, phoneNumber, email, password);
        wait.until(ExpectedConditions.urlToBe("https://preprod-business.draewil.net/#!/dashboard"));
        /*
         * Login
         */
        loginPage.openLoginPage();
        loginPage.loginUsingPhone(code, phoneNumber, password);
        wait.until(ExpectedConditions.urlToBe("https://preprod-business.draewil.net/#!/dashboard"));
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Edit']")));
        /*
         * Verifying user data after changes
         */
        String actualChangedFirstName = accountPage.getFirstName();
        String actualChangedLastName = accountPage.getLastName();
        Assert.assertEquals(actualChangedFirstName, changeFirstName);
        Assert.assertEquals(actualChangedLastName, changeLastName);
    }
}
