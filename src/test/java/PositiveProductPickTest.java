import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PositiveProductPickTest {

    @Description("Picking up the item from available options!")
    @Test
    public void pickingupBoltTshirt(){

        //first login to the window
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        // Enter credentials
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        //Select the product
        List<WebElement> selectProductOptions = driver.findElements(By.xpath("//*[.=\"Add to cart\"]"));
        selectProductOptions.get(2).click();



        driver.quit();
    }
}
