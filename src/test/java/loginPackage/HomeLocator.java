package loginPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student02 on 16.12.15.
 */
public class HomeLocator {
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/div[2]/div[6]/a")
    public WebElement button;
}
