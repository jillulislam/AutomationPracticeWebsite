package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;

public class SummerDressPage extends CommonActions {

    public SummerDressPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    public void verifyLaunchingOnSummerDressPage(){
        VerifyTest.verify("Summer Dresses - My Store",getPageTitle());
    }
}
