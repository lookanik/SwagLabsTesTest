package swag.lab.test.utility.coverage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utility.jsonFilesParser.JSONManagement;
import swag.lab.test.utility.page_object.LogInPageObject;
import swag.lab.test.utility.page_object.MenuOption;
import swag.lab.test.utility.page_object.ProductListingPage;

import java.io.IOException;

public class LogInFun {

    public static void logInValidAccount (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPageObject.userNameField).sendKeys(("standard_user"));
        driver.findElement(LogInPageObject.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productTitle));

    }

    public static void logInLockedAccount (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPageObject.userNameField).sendKeys(JSONManagement.readProperty("lockedOutUser"));
        driver.findElement(LogInPageObject.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.ErrorMessageLockedUser));

    }

    public static void logOutAccount (WebDriver driver, WebDriverWait wait){

        driver.findElement(MenuOption.menu).click();
        driver.findElement(MenuOption.logOut).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.logInButton));


    }
}
