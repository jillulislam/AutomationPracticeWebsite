package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends CommonActions{


    public Header(WebDriver driver){
        this.driver = driver;
        initElement();
    }
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signIn;

    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    WebElement chart;

    @FindBy(xpath = "//a[@title='My Store']/img")
    WebElement logo;

    @FindBy(xpath = "//a[@title='Return to Home']")
    WebElement returnToHome;

    public void clickOnSignInLink(){
        clickOn(signIn);
    }

    public void clickOnChart(){
        clickOn(chart);
    }

    public void clickOnLogo(){
        clickOn(logo);
    }

    public void clickOnReturnToHomeIcon(){
        clickOn(returnToHome);
    }
}
