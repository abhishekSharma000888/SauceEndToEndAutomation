import jdk.jfr.Description;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;

public class InvalidLoginTest {

    @Description("Enter valid username and invalid password to login")
    @Test
    public void invalidPasswordLoginTest(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        // Enter credentials
        username.sendKeys("standard_user");
        password.sendKeys("invalidPassword");
        loginButton.click();

       String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

       Assert.assertEquals(actualMessage, expectedMessage, "The text message failed to validate!!");

        driver.quit();
    }

    @Description("Enter invalid username and valid password to login")
    @Test
    public void invalidUsernameLoginTest(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        // Enter credentials
        username.sendKeys("problem_us");
        password.sendKeys("secret");
        loginButton.click();

        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertEquals(actualMessage, expectedMessage, "The text message failed to validate!!");

        driver.quit();
    }

    @Description("Enter invalid username and invalid password to login")
    @Test
    public void invalidUsernameAndInvalidPasswordLoginTest() throws IOException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        // Enter credentials
        username.sendKeys("problem_us");
        password.sendKeys("dummy");
        loginButton.click();

        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertEquals(actualMessage, expectedMessage, "The text message failed to validate!!");

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("/Users/abhisheksharma/Downloads/SDETProjects/SauceEndToEndAutomation/src/main/resources/screenshots/FirstScreenshot.png"));

        driver.quit();
    }
}
