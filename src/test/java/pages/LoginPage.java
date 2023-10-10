package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.CommonMethods;

public class LoginPage extends CommonMethods {
    @AndroidFindBy(xpath="//*[@text='Username']")
    public MobileElement usernameField;

    @AndroidFindBy(xpath="//*[@text='Password']")
    public MobileElement passwordField;

    @AndroidFindBy(xpath="//*[@text='LOGIN']")
    public MobileElement loginButton;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }




}
