package swag.lab.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import swag.lab.test.utility.BeforeAndAfter;
import swag.lab.test.utility.LogInFun;
import swag.lab.test.utility.fun.CartFun;
import swag.lab.test.utility.fun.PDPFun;
import swag.lab.test.utility.fun.PLPFun;

import java.io.IOException;

public class LogInValidAccountTest extends BeforeAndAfter {

    @Test(priority = 1, description = "Standard - Valid User Log In")
    public void validUserLogIn()  {

        LogInFun.logInValidUser(driver, wait);

    }

    @Test(priority = 2, description = "Standard - Valid User Log In")
    public void shoppingBagNameCheck() throws IOException, InterruptedException {

        //Log In
        LogInFun.logInValidUser(driver, wait);
        //Click on First Product from PLP
        PLPFun.clickOnFirstPLP(driver,wait);
        //Get Name of Product in PDP
        PDPFun.getNameOfProduct(driver,wait);
        //Add to Cart
        PDPFun.addProductToBag(driver, wait);
        //Go to Cart
        CartFun.goToCart(driver);
        //Get Name from Cart and Check
        CartFun.getProductNameInCart(driver);
        //Check Names













//        String myProductPDPName = driver.findElement(By
//                .xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"))
//                .getText();
//        System.out.println(myProductPDPName);
//
//        Assert.assertEquals(myProductPDPName, "Mihailo");


    }
}
