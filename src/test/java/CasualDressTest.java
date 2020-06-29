import commons.Configaration;
import org.junit.Before;
import org.junit.Test;
import pageObject.CasualDressPage;
import pageObject.HomePage;
import pageObject.PrintedDress;

public class CasualDressTest extends Configaration {

    CasualDressPage casualDressPage = new CasualDressPage(driver);
    HomePage homePage = new HomePage(driver);
    PrintedDress printedDress = new PrintedDress(driver);

    @Before
    public void openUrl(){
        casualDressPage.openUrl("http://automationpractice.com/index.php?id_category=9&controller=category");
    }
    @Test
    public void verifyRedirectingToHomePageUponClickingOnHomeIcon(){
        casualDressPage.header.clickOnReturnToHomeIcon();
        homePage.verifyLandingOnHomePage();
    }

    @Test
    public void verifyRedirectingToHomePageUponClickingOnLogo(){
        casualDressPage.header.clickOnLogo();
        homePage.verifyLandingOnHomePage();
    }

    @Test
    public void verifyItemCanBeAddedUponClickingOnAddToCartBtn() throws InterruptedException {
        casualDressPage.mouseHoveringOnAnItem();
        casualDressPage.clickOnAddToCart();
        casualDressPage.waitFor(3000);
        casualDressPage.itemSelectionPage.verifyItemIsAdded();
    }

    @Test
    public void verifyItemDescriptionPageIsOpenUponClickingObMoreBtn() throws InterruptedException {
        casualDressPage.mouseHoveringOnAnItem();
        casualDressPage.clickOnMore();
        casualDressPage.waitFor(3000);
        printedDress.verifyPageTitle();
    }

    @Test
    public void verifySelectedItemQuantityIsDisplayedOnChart() throws InterruptedException {
        casualDressPage.mouseHoveringOnAnItem();
        casualDressPage.clickOnAddToCart();
        casualDressPage.waitFor(3000);
        casualDressPage.itemSelectionPage.clickOnProceedToCheckOut();
    }
}
