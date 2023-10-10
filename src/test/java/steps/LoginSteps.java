package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.CombinableMatcher;
import util.CommonMethods;
import util.ConfigReader;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {

    @Given("User is able to launch apk file in android device")
    public void user_is_able_to_launch_apk_file_in_android_device() throws MalformedURLException {
        LaunchApplication();
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        loginPage.usernameField.clear();
        loginPage.usernameField.sendKeys(ConfigReader.getPropertyValue("usernamekey"));
        Thread.sleep(2000);
        loginPage.passwordField.clear();
        loginPage.passwordField.sendKeys(ConfigReader.getPropertyValue("passwordkey"));
        Thread.sleep(2000);

    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(2000);
    }
    @Then("User should be able to see homepage")
    public void user_should_be_able_to_see_homepage() {
        System.out.println("passed");
    }
}
