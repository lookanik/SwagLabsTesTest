package tools.qa;
import org.openqa.selenium.By;

public class QaToolsLoginPage extends BaseClass {

    By userName = By.id("userName");
    By password = By.id("password");
    By logInButton = By.id("login");

    public void typeUsername () throws InterruptedException {
        driver.findElement(userName).sendKeys("testthebest");
        Thread.sleep(2000);
    }

    public void typePassword () throws InterruptedException {

       driver.findElement(password).sendKeys("Vezbanjetester123!");
        Thread.sleep(2000);
    }

    public void clickLogInButton () throws InterruptedException {
        driver.findElement(logInButton).click();
        Thread.sleep(1000);
    }
}


