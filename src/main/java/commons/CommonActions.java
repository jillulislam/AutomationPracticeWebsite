package commons;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Method;

public class CommonActions {

    public WebDriver driver;

    public void initElement() {
        PageFactory.initElements(driver, this);
    }

    public void openUrl(String Url) {
        driver.get(Url);
    }

    public void clickOn(WebElement element) {
        element.click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }
//    not able to use Method overloading on this method
//    public String getTextOfAnElement(WebElement element){
//        String text = element.getText();
//        return text;
//    }

    public String getTextOfAnElement(WebElement element) {
        String text = element.getText();
        String newText = text.replace("\"", "");
        return newText;
    }

    public void mouseOverTo(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void waitFor(int milli) throws InterruptedException {
        Thread.sleep(milli);
    }

    public void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void switchToAlert() {
        Alert alert = driver.switchTo().alert();
    }
}