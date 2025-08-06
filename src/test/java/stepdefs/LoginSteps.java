package stepdefs;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("I open the SauceDemo site")
    public void i_open_the_sauce_demo_site() {
        loginPage.open();
    }

    @When("I login with valid username and password")
    public void i_login_with_valid_credentials() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("I login with {string} and {string}")
    public void i_login_with_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_see_inventory_page() {
        Assert.assertTrue(loginPage.isAtInventoryPage());
    }

    @Then("I should see an error message {string}")
    public void i_should_see_error_message(String expected) {
        Assert.assertEquals(loginPage.getErrorMessage(), expected);
    }
}
