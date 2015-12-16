package loginPackage;

import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student02 on 15.12.15.
 */
public class LoginPage {
    private HomePageLocators locators;

    public LoginPage(WebDriver driver){
        locators = new HomePageLocators();
        PageFactory.initElements((driver,locators));

    }

    public void loginAs(String username, String password){
        locators.usernameInput.sendKeys(username);
        locators.passwordInput.sendKeys(password);
        locators.signInButton.click();
    }
    public boolean isErrior(){
        try {
            locators.signInError.isDisplayed();
            return true;
        } catch (NoSuchContextException e){
            return false;
        }
    }
}
