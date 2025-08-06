Feature: Sauce Demo Login

  Scenario: Successful login
    Given I open the SauceDemo site
    When I login with valid username and password
    Then I should be redirected to the inventory page

  Scenario: Login with invalid credentials
    Given I open the SauceDemo site
    When I login with "standard_user" and "wrong_password"
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"
