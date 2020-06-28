package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends CommonActions {
    public Header header;
    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header(driver);
    }

    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement logOut_Text;

    public String getTextOfLogOut(){
        return getTextOfAnElement(logOut_Text);
    }

    public void verifyLaunchingOnMyAccountPage(){
        VerifyTest.verify("Sign out",getTextOfLogOut());
    }
}
