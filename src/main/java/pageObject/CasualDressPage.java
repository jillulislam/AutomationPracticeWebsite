package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.ItemSelectionPage;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasualDressPage extends CommonActions {

    public Header header;
    public ItemSelectionPage itemSelectionPage;

    public CasualDressPage(WebDriver driver) {
        this.driver = driver;
        initElement();
        header = new Header(driver);
        itemSelectionPage = new ItemSelectionPage(driver);
    }

    @FindBy(xpath = "//div[@class='product-container']")
    WebElement visible_image;

    @FindBy(xpath = "//a[@title='Add to cart']")
    WebElement btn_addToCart;@FindBy(xpath = "//div[2]/a[2]/span")
    WebElement btn_more;

    public void clickOnMore(){
        clickOn(btn_more);
    }




    public void verifyPageTitle(){
        VerifyTest.verify("Casual Dresses - My Store",getPageTitle());
    }

    public void mouseHoveringOnAnItem(){
        mouseOverTo(visible_image);
    }

    public void clickOnAddToCart(){
        clickOn(btn_addToCart);
    }
}