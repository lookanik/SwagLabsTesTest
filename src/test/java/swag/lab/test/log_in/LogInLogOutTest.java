package swag.lab.test.log_in;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;
import swag.lab.test.utility.fun.LogInFun;
import swag.lab.test.utility.page_object.LogInPageObject;

import java.io.IOException;

public class LogInLogOutTest extends BeforeAll {

    @Test(priority = 1, description = "TC-001 - Valid Log in Test")
    public void LogInLogOutTest() throws IOException {

        //Valid Log In
        LogInFun.logInValidAccount(driver, wait);
        //Log Out Test
        LogInFun.logOutAccount(driver, wait);







    }

    @Test(priority = 2)
    public void logInLockedUser() throws IOException {

        LogInFun.logInLockedAccount(driver, wait);
    }
}
