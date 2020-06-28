import commons.Configaration;
import org.junit.Before;
import org.junit.Test;
import pageObject.*;

public class HomepageTest extends Configaration {

    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);
    WomanPage womanPage = new WomanPage(driver);
    CasualDressPage casualDressPage = new CasualDressPage(driver);
    SummerDressPage summerDressPage = new SummerDressPage(driver);

    @Before
    public void openURL(){
        homePage.openUrl("http://automationpractice.com/index.php");
    }

    @Test
    public void verifyClickingOnSignInLink(){
        homePage.header.clickOnSignInLink();
        signInPage.verifyPageTitle();
    }

    @Test
    public void verifySystemIsNavigatingToWomanPage(){
        homePage.enterWomanInTextBox();
        homePage.clickOnSearch();
        womanPage.verifyLaunchingOnWomanPage();
    }

    @Test
    public void verifyClickingOnCasualDressesFromWomenLink(){
        homePage.mouseoverToWomen();
        homePage.clickOnCasualDress();
        casualDressPage.verifyPageTitle();
    }

    @Test
    public void verifyClickingOnSummerDressesFromDressLink(){
        homePage.mouseovertoDress();
        homePage.clickOnSummerDress();
        summerDressPage.verifyLaunchingOnSummerDressPage();
    }
}

