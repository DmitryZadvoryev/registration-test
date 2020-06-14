package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constant.Constant.ROOT;

/**
 * created by Dmitry Zadvoryev 12.06.2020
 * <p>
 * url https://preprod-business.draewil.net/#!/account
 */
public class AccountPage {

    private By saveButtonLocator = By.cssSelector("button[class = 'c-user-details-panel_button']");

    private By firstNameInputLocator = By.cssSelector("input[name = 'firstName']");

    private By lastNameInputLocator = By.cssSelector("input[name = 'lastName']");

    private By firstNameLocator = By.name("firstName");

    private By lastNameLocator = By.name("lastName");

    private By emailLocator = By.name("email");

    private By phoneNumberLocator = By.name("phoneNumber");

    private By formLocator = By.cssSelector("form[name = 'form']");

    private By editButtonLocator = By.xpath("//*[text() = 'Edit']");

    private final WebDriver driver;

    private final WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openAccountPage() {
        driver.get(ROOT + "account");
        waitForm();
    }

    public void waitForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(formLocator));
    }

    public void waitEditButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(editButtonLocator));
    }

    public AccountPage typeFirstName(String firstName) {
        driver.findElement(firstNameInputLocator).sendKeys(firstName);
        return this;
    }

    public AccountPage cleanFirstName() {
        driver.findElement(firstNameInputLocator).clear();
        return this;
    }

    public AccountPage cleanLastName() {
        driver.findElement(lastNameInputLocator).clear();
        return this;
    }

    public AccountPage typeLastName(String lastName) {
        driver.findElement(lastNameInputLocator).sendKeys(lastName);
        return this;
    }

    public AccountPage editButtonClick() {
        driver.findElement(editButtonLocator).click();
        return this;
    }

    public AccountPage saveButtonClick() {
        driver.findElement(saveButtonLocator).click();
        return this;
    }

    public String getFirstName() {
        return driver.findElement(firstNameLocator).findElement(By.cssSelector("span")).getText();
    }

    public String getLastName() {
        return driver.findElement(lastNameLocator).findElement(By.cssSelector("span")).getText();
    }

    public String getEmail() {
        return driver.findElement(emailLocator).findElement(By.cssSelector("span")).getText();
    }

    public String getPhoneNumber() {
        return driver.findElement(phoneNumberLocator).findElement(By.cssSelector("span")).getText();
    }

    public AccountPage editFirstAndLastName(String firstName, String lastName) {
        editButtonClick();
        cleanFirstName();
        cleanLastName();
        typeFirstName(firstName);
        typeLastName(lastName);
        saveButtonClick();
        return new AccountPage(driver);
    }
}
