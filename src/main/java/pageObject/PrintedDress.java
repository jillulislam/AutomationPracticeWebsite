package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;

public class PrintedDress extends CommonActions {


    public Header header;
    public PrintedDress(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header(driver);
    }

    public String getTitleOfPrintedDressPage(){
        return getPageTitle();
    }

    public void verifyPageTitle(){
        VerifyTest.verify("Printed Dress - My Store", getTitleOfPrintedDressPage());
    }
}
