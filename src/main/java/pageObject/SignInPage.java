package pageObject;

import commons.CommonActions;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.ScrollPaneUI;

public class SignInPage extends CommonActions {

    public SignInPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    @FindBy(name = "email_create")
    WebElement input_email;

    @FindBy(name = "SubmitCreate")
    WebElement btn_submit;

    public void verifyPageTitle(){
        VerifyTest.verify("Login - My Store", getPageTitle());
    }

    public void clickOnInputEmailTextBox(){
        clickOn(input_email);
    }

    public void enterAnEmailAddress(){
        typeText(input_email, "test1201104@test.com");
    }

    public void clickOnSubmit(){
        clickOn(btn_submit);
    }
}
