package swag.lab.test.plp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;
import swag.lab.test.utility.fun.LogInFun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PLPSorting extends BeforeAll {

    @Test
    public void sortingPLP() throws IOException, InterruptedException {

        LogInFun.logInValidAccount(driver, wait);
        Thread.sleep(1000);

        // Before filter - > Capture the Price
        List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));
        //Remove the $ symbol,  Convert String to Double
        List<Double> beforeFilterPriceList = new ArrayList<>();

        for (WebElement p : beforeFilterPrice){
            beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        //Filter The price From the Dropdown
        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (high to low)");

        //After Filter Capture the new Prices
        List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));

        //Remove the $ symbol,  Convert String to Double
        List<Double> afterFilterPriceList = new ArrayList<>();

        for (WebElement p: afterFilterPrice){
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        //Compare the values and Assert the values
        Collections.sort(beforeFilterPriceList); // list will get sorted in the ascending order
        Collections.reverse(beforeFilterPriceList);// list will get sorted in descending order

        Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
    }

    @Test(priority = 2)
    public void sortLowToHigh() throws IOException, InterruptedException {

        LogInFun.logInValidAccount(driver, wait);
        Thread.sleep(2000);
        List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> beforeFilterPriceList = new ArrayList<>();
        for (WebElement price : beforeFilterPrice){
            beforeFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
        }

        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);
        List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> afterFilterPriceList = new ArrayList<>();
        for (WebElement p: afterFilterPrice){
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Collections.sort(beforeFilterPriceList);
        Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
    }
}


