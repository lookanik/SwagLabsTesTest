package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utility.jsonFilesParser.JSONManagement;
import swag.lab.test.utility.page_object.LogInPage;
import swag.lab.test.utility.page_object.MenuOptionPageObject;
import swag.lab.test.utility.page_object.ProductListingPage;

import java.io.IOException;

public class LogInFun {

    public static void logInValidAccount (WebDriver driver, WebDriverWait wait) throws IOException {


        driver.findElement(LogInPage.userNameField).sendKeys(JSONManagement.readProperty("standardUser"));
        driver.findElement(LogInPage.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productTitle));

    }

    public static void logInLockedAccount (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPage.userNameField).sendKeys(JSONManagement.readProperty("lockedOutUser"));
        driver.findElement(LogInPage.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPage.ErrorMessageLockedUser));

    }

    public static void logOutAccount (WebDriver driver, WebDriverWait wait){

        driver.findElement(MenuOptionPageObject.menu).click();
        driver.findElement(MenuOptionPageObject.logOut).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPage.logInButton));


    }
}
