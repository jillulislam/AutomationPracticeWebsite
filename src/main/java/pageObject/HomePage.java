package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonActions {

    public Header header;
    public HomePage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header(driver);
    }

    @FindBy(id = "search_query_top")
    WebElement searchBox;

    @FindBy(name = "submit_search")
    WebElement submitSearch;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement women_link;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dress_link;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
    WebElement casualDresses_link;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
    WebElement summerDresses_link;



    public void enterWomanInTextBox(){
        typeText(searchBox,"woman");
    }

    public void clickOnSearch(){
        clickOn(submitSearch);
    }

    public void mouseoverToWomen(){
        mouseOverTo(women_link);
    }

    public void clickOnCasualDress(){
        clickOn(casualDresses_link);
    }

    public void mouseovertoDress(){
        mouseOverTo(dress_link);
    }

    public void clickOnSummerDress(){
        clickOn(summerDresses_link);
    }

    public void verifyLandingOnHomePage(){
        VerifyTest.verify("My Store",getPageTitle());
    }
}
