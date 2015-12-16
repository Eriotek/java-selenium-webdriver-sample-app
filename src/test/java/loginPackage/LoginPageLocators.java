package loginPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student02 on 15.12.15.
 */
public class LoginPageLocators {

    @FindBy(how = How.ID, using = "LoginForm__username")
    public WebElement usernameInput;

    @FindBy(how = How.ID, using = "LoginForm__password")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "LoginForm_save")
    public WebElement signInButton;


}
