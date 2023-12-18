package swag.lab.test.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.page_object.LogInPage;
import swag.lab.test.page_object.ProductListingPage;

public class LogInFun {

    public static void logInValidUser(WebDriver driver, WebDriverWait wait){

        driver.findElement(LogInPage.userNameField).sendKeys(LogInPage.validUser);
        driver.findElement(LogInPage.passwordField).sendKeys(LogInPage.userPassword);
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productsHeaderText));

    }
}
