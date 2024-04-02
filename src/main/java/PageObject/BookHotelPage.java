package PageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {

    WebDriver webDriver;

    public BookHotelPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy ( xpath = "//tr[12]/td[contains(.,'First Name*')]")
    private WebElement firstName;
    @FindBy(xpath = "//tr[13]/td[contains(.,'Last Name*')]")
    private WebElement lastName;
    @FindBy(xpath = "//tr[14]/td[contains(.,'Billing Address*')]")
    private WebElement billingAddress;
    @FindBy(xpath = "//tr[15]/td[contains(.,'Credit Card No.*')]")
    private WebElement creditCardNo;
    @FindBy(xpath = "//tr[16]/td[contains(.,'Credit Card Type*')]")
    private WebElement creditCardType;
    @FindBy(xpath = "//tr[17]/td[contains(.,'Expiry Date*')]")
    private WebElement expiryDate;
    @FindBy(xpath = "//tr[18]/td[contains(.,'CVV Number*')]")
    private WebElement cvvNumber;
    @FindBy(id = "book_now")
    private WebElement bookNow;
    @FindBy(id = "cancel")
    private WebElement cancel;

    public WebElement getFirstName(){
        return this.firstName;
    }
    public WebElement getLastName(){
        return this.lastName;
    }
    public WebElement getBillingAddress(){
        return this.billingAddress;
    }
    public WebElement getCreditCardNo(){
        return this.creditCardNo;
    }
    public WebElement getCreditCardType(){
        return this.creditCardType;
    }
    public WebElement getExpiryDate(){
        return this.expiryDate;
    }
    public WebElement getCvvNumber(){
        return this.cvvNumber;
    }
    public WebElement getBookNow(){
        return this.bookNow;
    }
    public WebElement getCancel(){
        return this.cancel;
    }

    public void enterFirstName(String firstName){
        if(getFirstName().isDisplayed()){
            getFirstName().sendKeys(firstName);
        }
    }

    public void enterLastName(String lastName){
        if (getLastName().isDisplayed()){
            getLastName().sendKeys(lastName);
        }
    }

    public void enterBillingAddress(String billingAddress){
        if (getBillingAddress().isDisplayed()){
            getBillingAddress().sendKeys(billingAddress);
        }
    }

    public void enterCreditCardNoc(String creditCardNo){
        if (getCreditCardNo().isDisplayed()){
            getCreditCardNo().sendKeys(creditCardNo);
        }
    }

    public void selectCreditCardType(String optionText) throws InterruptedException {
        creditCardType.click();
        Thread.sleep(3000);
        Select cardType = new Select(creditCardType);
        cardType.selectByVisibleText(optionText);
        Thread.sleep(3000);
    }

    public void selectYear(String optionYear) throws InterruptedException {
        expiryDate.click();
        Thread.sleep(3000);
        Select expiredDate = new Select(expiryDate);
        expiredDate.selectByVisibleText(optionYear);
        Thread.sleep(3000);
    }

    public void selectMonth(String optionMonth) throws InterruptedException {
        expiryDate.click();
        Thread.sleep(3000);
        Select expiredDate = new Select(expiryDate);
        expiredDate.selectByVisibleText(optionMonth);
    }

    public void enterCvvNumber(String cvvNumber){
        if (getCvvNumber().isDisplayed()){
            getCvvNumber().sendKeys(cvvNumber);
        }
    }
    public void clickBookNow(){
        if (getBookNow().isDisplayed()){
            getBookNow().click();
        }
    }
    public void clickCancel(){
        if (getCancel().isDisplayed()){
            getCancel().click();
        }
    }
}
