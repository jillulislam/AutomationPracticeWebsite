import commons.Configaration;
import org.junit.Before;
import org.junit.Test;
import pageObject.AccountCreationPage;
import pageObject.MyAccountPage;
import pageObject.SignInPage;

public class SignInTest extends Configaration {

    SignInPage signInPage = new SignInPage(driver);
    AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Before
    public void openURL(){
        signInPage.openUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void verifyClickingOnCreateAnAccountBtnNavigateToAccountCreationPage() throws InterruptedException {
        signInPage.enterAnEmailAddress();
        signInPage.waitFor(3000);
        signInPage.clickOnSubmit();
        signInPage.waitFor(3000);
        accountCreationPage.verifyLaunchingOnTheAccountCreationPage();
    }

    @Test
    public void verifyCreatingAnAccount() throws InterruptedException {
        signInPage.enterAnEmailAddress();
        signInPage.waitFor(3000);
        signInPage.clickOnSubmit();
        signInPage.waitFor(3000);
        accountCreationPage.clickOnMr();
        accountCreationPage.enterFirstName();
        accountCreationPage.enterLastName();
        accountCreationPage.enterPassword();
        accountCreationPage.selectADate();
        accountCreationPage.selectAMonth();
        accountCreationPage.selectAYear();
        accountCreationPage.enterCompanyName();
        accountCreationPage.enterAddress();
        accountCreationPage.enterAddressLine2();
        accountCreationPage.enterCityName();
        accountCreationPage.selectStateName();
        accountCreationPage.enterPostCode();
        accountCreationPage.selectCountryName();
        accountCreationPage.enterAMobileNumber();
        accountCreationPage.assignAnAddress();
        accountCreationPage.clickOnRegister();
        myAccountPage.verifyLaunchingOnMyAccountPage();
    }
}