package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.InviteCode;

import static constant.Constant.ROOT;

/**
 * created by Dmitry Zadvoryev 12.06.2020
 * <p>
 * url https://preprod-business.draewil.net/#!/registration
 */
public class RegistrationPage {

    By firstNameLocator = By.cssSelector("input[name = 'firstName']");

    By lastNameLocator = By.cssSelector("input[name = 'lastName']");

    By codeLocator = By.cssSelector("select[name = 'phoneDiallingCode']");

    By phoneNumberLocator = By.cssSelector("input[name = 'phonePhoneNumber']");

    By emailLocator = By.cssSelector("input[name = 'email']");

    By passwordLocator = By.cssSelector("input[name = 'password']");

    By inviteCodeLocator = By.cssSelector("input[name = 'inviteCode']");

    By termsAndConditionLocator = By.cssSelector("input[name= 'terms']");

    By formLocator = By.cssSelector("form[name = 'form']");

    By registrationButtonLocator = By.cssSelector("button");

    private final WebDriver driver;

    private final WebDriverWait wait;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openRegistrationPage() {
        driver.get(ROOT + "registration");
        waitForm();
    }

    public void waitForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(formLocator));
    }

    public RegistrationPage typeFirstName(String firstName) {
        driver.findElement(firstNameLocator).sendKeys(firstName);
        return this;
    }

    public RegistrationPage typeLastName(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
        return this;
    }

    public RegistrationPage selectCode(String code) {
        WebElement element = driver.findElement(codeLocator);
        Select select = new Select(element);
        select.selectByVisibleText(code);
        return this;
    }

    public RegistrationPage typePhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberLocator).sendKeys(phoneNumber);
        return this;
    }

    public RegistrationPage typeEmail(String email) {
        driver.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public RegistrationPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public RegistrationPage typeInviteCode() {
        driver.findElement(inviteCodeLocator).sendKeys(InviteCode.getCurrentInviteCode());
        return this;
    }

    public RegistrationPage selectTermsAndConditions() {
        driver.findElement(termsAndConditionLocator).click();
        return this;
    }

    public LoginPage registration() {
        driver.findElement(registrationButtonLocator).submit();
        return new LoginPage(driver);
    }

    public LoginPage accountRegistration(String firstName, String lastName, String code, String phoneNumber,
                                         String email, String password) {
        typeFirstName(firstName);
        typeLastName(lastName);
        selectCode(code);
        typePhoneNumber(phoneNumber);
        typeEmail(email);
        typePassword(password);
        typeInviteCode();
        //selectTermsAndConditions();

        return registration();
    }

}
