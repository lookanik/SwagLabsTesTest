package swag.lab.test.log_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class LogInProba {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;
    @BeforeTest
    public void setUp()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://www.saucedemo.com/";
//

    }

    @Test (priority = 1)
    public void checkoutTest() throws InterruptedException {

        driver.get(baseURL);
        driver.findElement(By.id("user-name")).click();
       //Click on Username field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       //Is Proper Text
        driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();
        Thread.sleep(2000);

    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}
