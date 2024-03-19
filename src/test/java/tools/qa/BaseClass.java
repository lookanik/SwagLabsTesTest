package tools.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseClass {

    public static WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    //luka
    @BeforeSuite
    public void initializeWebDriver() throws IOException {

       // options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); //Add "options" to new ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}
