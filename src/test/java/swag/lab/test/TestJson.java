package swag.lab.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import swag.lab.test.utility.jsonFilesParser.JSONManagement;

import java.io.IOException;

public class TestJson {

    @Test
    public void testJson() throws IOException {

        //JSON stands for JavaScript Object Notation
        //JSON is a lightweight format for storing and transporting data
        //JSON is often used when data is sent from a server to a web page
        //JSON is "self-describing" and easy to understand

        String reedStandardUser = JSONManagement.readProperty("standardUser");
        System.out.println(reedStandardUser);

        String prefix = "Test_";
        String username = prefix + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        System.out.println(username);

    }
}

