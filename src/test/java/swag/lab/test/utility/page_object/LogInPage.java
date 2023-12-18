package swag.lab.test.utility.page_object;
import org.openqa.selenium.By;

public class LogInPage {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By logInButton = By.id("login-button");
    public static By ErrorMessageLockedUser = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]");

    }
    