package swag.lab.test.log_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import swag.lab.test.utility.coverage.BeforeAll;


public class LogInCheckText extends BeforeAll {

    @Test(priority = 1)
    public void logInCheckText() throws Exception {

        // Locate the parent div containing login credentials
        WebElement loginCredentialsDiv = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("login_credentials")));

        // Get the text content of all child elements within the parent div
        String loginCredentialsText = loginCredentialsDiv.getText();

        // Print all text
        System.out.println("Login Credentials ALL Text: " + loginCredentialsText);

        System.out.println();
        System.out.println("--------");;
        // Extract the "locked_out_user" from the text
        String[] usernames = loginCredentialsText.split("\n");
        String lockedOutUser = usernames[2]; // "locked_out_user" is at index 2

        // Print
        System.out.println("Locked Out User: " + lockedOutUser);

    }
}
