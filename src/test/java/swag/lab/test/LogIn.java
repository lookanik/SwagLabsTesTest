package swag.lab.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import swag.lab.test.page_object.LogInPageObject;
import swag.lab.test.utility.BeforeAndAfter;
import swag.lab.test.utility.LogInFun;

public class LogIn extends BeforeAndAfter {

    @Test(priority = 1, description = "Standard - Valid User Log In")
    public void validUserLogIn()  {

        driver.findElement(LogInPageObject.userNameField).click();
        driver.findElement(LogInPageObject.userNameField).
                sendKeys(LogInPageObject.validUser);
        driver.findElement(LogInPageObject.userNameField).click();
        driver.findElement(LogInPageObject.userNameField).
                sendKeys(LogInPageObject.validUser);






        LogInFun.logInValidUser(driver, wait);

    }
}
