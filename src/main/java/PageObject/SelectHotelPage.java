package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectHotelPage {


    WebDriver webDriver;

    public SelectHotelPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//input[@value='0']")
    private WebElement selectHotelRadioBtn;

    @FindBy (id = "continue")
    private WebElement continueBtn;

    public WebElement getSelectHotelRadioBtn(){
        return this.selectHotelRadioBtn;
    }

    public WebElement getContinueBtn(){
        return this.continueBtn;
    }

    public void clickselectHotelRadioBtn(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));
    wait.until(ExpectedConditions.elementToBeClickable(selectHotelRadioBtn));
    selectHotelRadioBtn.click();
    }

    public void clickContinue(){
        if (getSelectHotelRadioBtn().isDisplayed()){
            getSelectHotelRadioBtn().click();
        }
    }

}
