package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemSelectionPage extends CommonActions{

    public ItemSelectionPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    WebElement text_addedToBasket;


    @FindBy(xpath = "//a[@title='Proceed to checkout']/span")
    WebElement proceedToCheckout;



    public String getTextOfConfirmation(){
        return getTextOfAnElement(text_addedToBasket);
    }

    public void verifyItemIsAdded(){
        VerifyTest.verify("Product successfully added to your shopping cart",
                getTextOfConfirmation());
    }

    public void clickOnProceedToCheckOut(){
        clickOn(proceedToCheckout);
    }

}
