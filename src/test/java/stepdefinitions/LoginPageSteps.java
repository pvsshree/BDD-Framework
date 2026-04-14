package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
private static 	String title;
 private LoginPage loginPage  = new LoginPage(DriverFactory.getDriver()) ;

@Given("User is on the Orange HRM Login Page")
public void user_is_on_the_Orange_HRM_login_page() {
	DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");; 
}

@When("User gets title of the page")
public void user_gets_title_of_the_page() {
	String title = loginPage.getLoginPageTitle();  
    System.out.println("Title is " +title);

}

@Then("page title should be {string}")
public void page_title_should_be(String expectedTitleName) {
	String title = loginPage.getLoginPageTitle(); 
    Assert.assertTrue(title.contains(expectedTitleName));
}

@Given("User is on login page")
public void user_is_on_login_page() {
    
}

@Then("Forgot password link should be displayed")
public void forgot_password_link_should_be_displayed() {
    Assert.assertTrue(loginPage.isForgotPswdLinkExist());
	
}

@When("User enters username {string}")
public void user_enters_username(String username) {
    loginPage.enterUsername(username);
}

@When("User enters password {string}")
public void user_enters_password(String password) {
    loginPage.enterPassword(password);
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
    loginPage.ClickOnLogin();
}

@Then("User gets title of page")
public void user_gets_title_of_page() {
    
}


}
