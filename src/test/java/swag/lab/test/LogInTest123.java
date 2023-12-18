package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LogInTest123 extends BeforeAll{


    @Test
    public void logInTest() throws InterruptedException {

        driver.get(baseURL);
        // Click on Username Field
        driver.findElement(By.id("usesdfsdfrname")).click();
        Thread.sleep(2000);
        //Enter valid username
        driver.findElement(By.id("e")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Products')]"))
                .isDisplayed();
        Thread.sleep(2000);
        driver.findElement(By.id("shopping_cart_container")).isDisplayed();
        Thread.sleep(2000);



        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[contains(text(),'Products')]")));


    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}

