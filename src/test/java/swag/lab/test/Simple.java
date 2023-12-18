package swag.lab.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Simple {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "www.simple.org";

    }

    @Test
    public void simple() {

        //Test Code

    }


    @BeforeTest
    public void endTest() {


        //End Test
    }

}
