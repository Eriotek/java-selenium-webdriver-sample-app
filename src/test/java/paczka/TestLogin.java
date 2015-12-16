package paczka;

import com.sun.xml.internal.bind.v2.model.core.ID;
import loginPackage.HomeLocator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by student02 on 15.12.15.
 */
public class TestLogin {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @Test
    public void testLoginPage() {

        driver.navigate().to("https://testingcup.pgs-soft.com");
        Home home = new Home(driver);
        home.click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("tester","123-xyz");

    }

    /*
    @Test

    public void testLoginPage() {
        driver.navigate().to("https://owa.pgs-soft.com");
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("login");
        WebElement usernameInputPwd = driver.findElement(By.id("password"));
        usernameInputPwd.sendKeys("haslo");
        WebElement submitButton = driver.findElement(By.className("signinbutton"));
        submitButton.submit();
        Assert.assertTrue(isElementPresent(By.id("signInErrorDiv")));
    }
    */
    /*
    @Test
    public void testRadioButton(){
        driver.navigate().to("http://codeseven.github.io/toastr/demo.html");
        List<WebElement> toastTypeRadioButtons = driver.findElements(By.xpath("//*[@id='toastTypeGroup']//input[@type='radio']"));
        for(int i = 0; i < toastTypeRadioButtons.size(); i++) {
            toastTypeRadioButtons.get(i).click();
            Assert.assertTrue("Radio button should be selected", toastTypeRadioButtons.get(i).isSelected());
        }


    }
    */
    /*
    @Test
    public void testDropdown(){
        driver.navigate().to("https://testingcup.pgs-soft.com/");
        driver.findElement(By.linkText("Zadanie 8")).click();
        WebElement typyKartyWebElement = driver.findElement(By.id("task8_form_cardType"));
        Select typyKarty = new Select(typyKartyWebElement);
        typyKarty.selectByVisibleText("Discover");

        Assert.assertEquals("Discover", typyKarty.getFirstSelectedOption().getText());

        WebElement nazwaMiesiacaWebElement = driver.findElement(By.id("task8_form_cardInfo_month"));
        Select nazwaMiesiaca = new Select(nazwaMiesiacaWebElement);
        nazwaMiesiaca.selectByVisibleText("April");
        Assert.assertEquals("April", nazwaMiesiaca.getFirstSelectedOption().getText());



    }
    */
//    public boolean isElementPresent(By by){
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
       // driver.quit();

    }
}
