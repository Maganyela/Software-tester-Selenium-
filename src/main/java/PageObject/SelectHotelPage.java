package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

    WebDriver webDriver;

    public SelectHotelPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//table[@class='login']//tr[2]//input[@value='0']")
    private WebElement selectHotelRadiobtn;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;

    public WebElement getSelectHotelRadiobtn(){
        return this.selectHotelRadiobtn;
    }

    public WebElement getContinueBtn(){
        return this.continueBtn;
    }

    public void clickSelectHotelRadiobtn(){
        if (getSelectHotelRadiobtn().isDisplayed()){
            getSelectHotelRadiobtn().click();
        }
    }



}
