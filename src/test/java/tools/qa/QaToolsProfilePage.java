package tools.qa;
import org.openqa.selenium.By;

public class QaToolsProfilePage extends BaseClass {

    By profileText = By.xpath("//div[contains(text(),'Profile')]");

    public void verifyProfileTextIsPresent () {

        driver.findElement(profileText).isDisplayed();
    }

}


