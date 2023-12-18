import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;

public class MyStoreSignUp extends BeforeAll {

    @Test
    public void paraBankCreateAccount() {

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        String prefix = "myEmail_";
        String myEmailName = prefix + RandomStringUtils.randomAlphanumeric(5).toLowerCase();

        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(myEmailName+"@yopmail.com");
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("New");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Man");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("TestingQa25!");

        driver.findElement(By.xpath("//select[@id='days']")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/select[1]/option[16]")).click();
        driver.findElement(By.xpath("//select[@id='months']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'January')]")).click();
        driver.findElement(By.xpath("//select[@id='years']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'2000')]")).click();

        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("New York 22");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//select[@id='id_state']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Alabama')]")).click();
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("11000");
        driver.findElement(By.xpath("//select[@id='id_country']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'United States')]")).click();
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("0702423424");
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Neka tamo 22");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

        //Check the Welcome page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]"))).isDisplayed();

    }
}

