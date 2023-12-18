package swag.lab.test.utility.coverage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import swag.lab.test.utility.jsonFilesParser.JSONManagement;


import java.io.IOException;
import java.time.Duration;

public class BeforeAll {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;
    ChromeOptions options = new ChromeOptions();

    @BeforeTest
    public void setUp() throws IOException {

        // options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); //Add "options" to new ChromeDriver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = JSONManagement.readProperty("baseURL");
        driver.get(baseURL);

    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}

