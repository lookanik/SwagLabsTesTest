//import org.apache.commons.lang3.RandomStringUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.annotations.Test;
//import swag.lab.test.utility.coverage.BeforeAll;
//
//
//public class ParaBankCreateAccount extends BeforeAll {
//
//    @Test
//    public void paraBankCreateAccount() {
//
//        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=81D1EE5AA30DCE69AD642C4F6DEC3619");
//
//        driver.findElement(By.id("customer.firstName")).sendKeys("Neko");
//        driver.findElement(By.id("customer.lastName")).sendKeys("Neko");
//        driver.findElement(By.id("customer.address.street")).sendKeys("Humska 22");
//        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
//        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
//        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11000");
//        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0706534546");
//        driver.findElement(By.id("customer.ssn")).sendKeys("123");
//
//
//
//
//        String prefix = "MyEmail_";
//        String myMail = prefix +
//                RandomStringUtils.randomAlphanumeric(5).toLowerCase();
//       // driver.findElement(By.id("email_address")).sendKeys(myMail);
//
//
//
//
//
//
//
//
//        driver.findElement(By.id("customer.password")).sendKeys("Tajna123!");
//        driver.findElement(By.id("repeatedPassword")).sendKeys("Tajna123!");
//        driver.findElement(By.xpath("//input[contains(@value, 'Register')]")).click();
//
//        //Check the Welcome Name!
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Welcome " +username+ "')]"))).isDisplayed();
//
//
//    }
//}
