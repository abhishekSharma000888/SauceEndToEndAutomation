import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginTest {

    @Description("Enter valid username and valid password to login")
    @Test
    public void validLoginTest(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));

        // Enter credentials
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        boolean isOnInventoryPage = driver.getCurrentUrl().contains("inventory");
        if (isOnInventoryPage) {
            System.out.println("✅ Login successful. Inventory page loaded.");
        } else {
            System.out.println("❌ Login failed. Inventory page not loaded.");
        }


        driver.quit();
    }
}
