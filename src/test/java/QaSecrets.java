import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QaSecrets extends BeforeAll {

    @Test
    public void secrets() throws InterruptedException, IOException {

        //Change TAB
        String originalHandle = driver.getWindowHandle();

        //Do something on open new tab

        for(String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(originalHandle);


        //------------------------------------------------------//
        //Mouse Over//
        Actions actions = new Actions(driver);
        WebElement Devices = driver.findElement(By.xpath("...1.."));

        actions.moveToElement(Devices);
        Thread.sleep(1000);
        WebElement ShopDevices = driver.findElement(By.xpath("..2..."));
        actions.moveToElement(ShopDevices).moveToElement(driver.findElement(By.xpath("...2...")))
                .click().build().perform();

        //-----------------------------------------------------//
        //JavaSC executor//

        WebElement selectAll = driver.findElement(By.xpath("......"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", selectAll);

        //-----------------------------------------------------//
        //RandomStringUtils
        String prefix = "Test_";
        String username = prefix + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        System.out.println(username);

        //-----------------------------------------------------//
        // Slider Move

        WebElement sliderLocation = driver.findElement(By.xpath("......"));
        WebElement elem17 = driver.findElement(By.xpath("......"));
        Actions action = new Actions(driver);
        action.clickAndHold(sliderLocation).moveToElement(elem17).release(sliderLocation).build().perform();

        //-----------------------------------------------------//
        //Move Negligible

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement a = driver.findElement(By.xpath("....."));
        js.executeScript("arguments[0].setAttribute('style', 'left: 62.5%;')",a);

        WebElement slider = driver.findElement(By.xpath("....."));
        Actions move = new Actions(driver);
        Action myAction = move.dragAndDropBy(slider, 30, 0).build();
        myAction.perform();

        //------------------------------------------------------//
        //Upload FIle

        driver.findElement(By.id("myUploadElement")).sendKeys("<absolutePathToMyFile>");

       // ---------------------------------------------------------//
        // Xpath

        //button[contains(@data-ruid, 'base-button-add-members')]
        //img[contains(@src, '/img/emoji_sunglasses.bc172cb8.svg')]
        //button[starts-with(@id, 'Submit-')]


       // ---------------------------------------------------------//
        //Sorting

        //PLP Descending
        ArrayList<String> FirstList = new ArrayList<String>();
        List<WebElement> elementList = driver.findElements(By.xpath("..1.."));
        for (WebElement first : elementList) {

            FirstList.add(first.getText());
            System.out.println(first.getText());
        }

        ArrayList<String> SortedList = new ArrayList<String>();
        for (String second : FirstList) {
            SortedList.add(second);
        }

        Collections.sort(SortedList);
        Collections.reverse(SortedList);
        Assert.assertEquals(FirstList, SortedList);

        //---------------------------------------------------------------//
        //IF

        if (driver.findElements(By.xpath("......")).size() != 0){
            driver.findElement(By.xpath("......"));
        } else {
            throw new InterruptedException();
        }

        //-------------------------------------------------//
        //Screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("/home/qaTesting25/Documents/SeleniumScreanshot/"));

        //-------------------------------------------------//
        //Scroll Page
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("window.scrollBy(0,800)", "");

    }
}
