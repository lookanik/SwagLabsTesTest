package swag.lab.test.log_in;

import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;
import swag.lab.test.utility.fun.LogInFun;

import java.io.IOException;

public class LogInLogOutTest extends BeforeAll {

    @Test(priority = 1)
    public void validLogInAndLogOut() throws Exception {

        LogInFun.logInValidAccount(driver, wait);
        LogInFun.logOutAccount(driver, wait);

    }

    @Test(priority = 2)
    public void logInLockedUser() throws IOException {

        LogInFun.logInLockedAccount(driver, wait);
    }
}
