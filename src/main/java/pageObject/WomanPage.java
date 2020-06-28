package pageObject;

import commons.CommonActions;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanPage extends CommonActions {

    public WomanPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    WebElement text_woman;

    public void verifyLaunchingOnWomanPage(){
        VerifyTest.verify("WOMAN", getTextOfAnElement(text_woman));
    }
}
