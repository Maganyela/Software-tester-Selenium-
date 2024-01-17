package PageObject;

import BaseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
     WebDriver webDriver;

     public LoginPage( WebDriver webDriver){
         this.webDriver = webDriver;
         PageFactory.initElements(webDriver, this);
     }

     @FindBy (id = "username")
     private WebElement usernameTxt;

     @FindBy(id = "password")
     private WebElement passwordTxt;

     @FindBy(id = "login")
     private WebElement loginBtn;

     public WebElement getUsernameTxt(){
         return this.usernameTxt;
     }

     public WebElement getPasswordTxt(){
         return this.passwordTxt;
     }

     public WebElement getLoginBtn(){
         return this.loginBtn;
     }

     public void enterUserName(String username){
         if(getUsernameTxt().isDisplayed()){
             getUsernameTxt().sendKeys(username);
         }
     }

     public void enterPassword(String password){
         if (getPasswordTxt().isDisplayed()){
             getPasswordTxt().sendKeys(password);
         }
     }

     public void clickLoginbtn(){
         if(getLoginBtn().isDisplayed()){
             getLoginBtn().click();
         }
     }

}
