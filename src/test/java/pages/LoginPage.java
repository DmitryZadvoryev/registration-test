package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constant.Constant.ROOT;

/**
 * created by Dmitry Zadvoryev 12.06.2020
 * <p>
 * url https://preprod-business.draewil.net/#!/login
 */
public class LoginPage {

    By usingEmailLocator = By.cssSelector("a[class = 'c-credential-input_picker-choice']");

    By phoneNumberLocator = By.cssSelector("input[name = 'phonePhoneNumber']");

    By passwordLocator = By.cssSelector("input[name = 'password']");

    By codeLocator = By.cssSelector("select[name = 'phoneDiallingCode']");

    By formLocator = By.cssSelector("form[name = 'form']");

    By logIn = By.cssSelector("button");

    private final WebDriver driver;

    private final WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openLoginPage() {
        driver.get(ROOT + "login");
        wait.until(ExpectedConditions.presenceOfElementLocated(formLocator));
    }

    public LoginPage typePhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberLocator).sendKeys(phoneNumber);
        return this;
    }

    public LoginPage selectCode(String code) {
        WebElement element = driver.findElement(codeLocator);
        Select select = new Select(element);
        select.selectByVisibleText(code);
        return this;
    }

    public LoginPage typeEmail(String email) {
        throw new UnsupportedOperationException();
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public AccountPage logInButton() {
        driver.findElement(logIn).submit();
        return new AccountPage(driver);
    }

    public AccountPage loginUsingPhone(String code, String phoneNumber, String password) {
        selectCode(code);
        typePhoneNumber(phoneNumber);
        typePassword(password);
        return logInButton();
    }

    public AccountPage loginUsingEmail(String code, String email, String password) {
        throw new UnsupportedOperationException();
    }

}
