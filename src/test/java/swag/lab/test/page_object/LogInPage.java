package swag.lab.test.page_object;

import org.openqa.selenium.By;

public class LogInPage {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static String validUser = "standard_user";
    public static String userPassword = "secret_sauce";
    public static By logInButton = By.id("login-button");
    public static By mainPic = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");

}
