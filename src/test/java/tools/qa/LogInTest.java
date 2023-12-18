package tools.qa;
import org.testng.annotations.Test;


public class LogInTest extends BaseClass{

    @Test (priority = 1, description = "User can Log in")
    public void logIn() throws InterruptedException {

        QaToolsLoginPage login = new QaToolsLoginPage();
        login.typeUsername();
        login.typePassword();
        login.clickLogInButton();

        QaToolsProfilePage profilePage = new QaToolsProfilePage();
        profilePage.verifyProfileTextIsPresent();

    }
}

