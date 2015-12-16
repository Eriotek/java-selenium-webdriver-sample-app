package paczka;

import loginPackage.HomeLocator;
import loginPackage.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student02 on 16.12.15.
 */
public class Home {

    private HomeLocator homeLocator;

    public Home(WebDriver driver){
        homeLocator = new HomeLocator();
        PageFactory.initElements(driver,homeLocator);
    }

    public void click() {
        homeLocator.button.click();
    }


}
