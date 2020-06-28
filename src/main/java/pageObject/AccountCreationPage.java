package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.VerifyTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends CommonActions {

    public Header header;
    public AccountCreationPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header(driver);
    }

    @FindBy(id = "id_gender1")
    WebElement radio_mr;

    @FindBy(id = "customer_firstname")
    WebElement fst_name;

    @FindBy(id = "customer_lastname")
    WebElement lst_name;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "days")
    WebElement days;

    @FindBy(id = "months")
    WebElement months;

    @FindBy(id = "years")
    WebElement years;

    @FindBy(id = "newsletter")
    WebElement check_newsletter;

    @FindBy(id = "optin")
    WebElement check_speacialOffer;

    @FindBy(id = "firstname")
    WebElement firstNameAddressSec;

    @FindBy(id= "lastname")
    WebElement LastNameAddressSec;

    @FindBy(id= "company")
    WebElement companyName;

    @FindBy(id= "address1")
    WebElement address;

    @FindBy(id= "address2")
    WebElement addressLine2;

    @FindBy(id= "city")
    WebElement city;

    @FindBy(id= "id_state")
    WebElement state;

    @FindBy(id= "postcode")
    WebElement postcode;

    @FindBy(id= "id_country")
    WebElement country;

    @FindBy(id= "other")
    WebElement textBox;

    @FindBy(id= "phone")
    WebElement phone;

    @FindBy(id= "phone_mobile")
    WebElement phone_mobile;

    @FindBy(id= "alias")
    WebElement addressForRef;

    @FindBy(id= "submitAccount")
    WebElement btn_register;

    public void clickOnMr(){
        clickOn(radio_mr);
    }

    public void enterFirstName(){
        typeText(fst_name,"ali");
    }

    public void enterLastName(){
        typeText(lst_name,"Ahmed");
    }

    public void enterPassword(){
        typeText(password,"Test123");
    }

    public void selectADate(){
        selectByValue(days,"22");
    }

    public void selectAMonth(){
        selectByValue(months,"6");
    }

    public void selectAYear(){
        selectByValue(years,"2002");
    }

    public void enterCompanyName(){
        typeText(companyName,"City Reed");
    }

    public void enterAddress(){
        typeText(address,"155 W 51st St, United States");
    }

    public void enterAddressLine2(){
        typeText(addressLine2,"New York");
    }

    public void enterCityName(){
        typeText(city,"New York");
    }

    public void selectStateName(){
        selectByVisibleText(state,"New York");
    }

    public void enterPostCode(){
        typeText(postcode,"10019");
    }

    public void clickOnRegister(){
        clickOn(btn_register);
    }

    public void selectCountryName(){
        selectByVisibleText(country,"United States");
    }

    public void enterAMobileNumber(){
        typeText(phone_mobile,"+1 212-554-1515");
    }

    public void assignAnAddress(){
        typeText(addressForRef,"New York");
    }

    public void verifyLaunchingOnTheAccountCreationPage(){
        VerifyTest.verify("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation",
                getURL());
    }
}
