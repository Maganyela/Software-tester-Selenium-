package PageObject;

import BaseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage{

    WebDriver webDriver;

    public SearchHotelPage( WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "location")
    private WebElement locationDropDown;

    @FindBy(id = "hotels")
    private WebElement hotelDropdown;

    @FindBy(id = "room_type")
    private WebElement roomDropdown;

    @FindBy(id = "room_nos")
    private WebElement selectNoOfRoom;

    @FindBy(id = "datepick_in")
    private  WebElement checkInDate;

    @FindBy(id = "datepick_out")
    private WebElement checkOutdate;

    @FindBy(id = "adult_room")
    private WebElement adultRoomDropdown;

    @FindBy(id = "child_room")
    private  WebElement selectChildRoomDropdown;

    @FindBy(id = "Submit")
    private WebElement submitBtn;

    public WebElement getLocationDropDown() {
        return this.locationDropDown;
    }
    public WebElement getHotelDropdown() {
        return this.hotelDropdown;
    }
    public WebElement getRoomDropdown() {
        return this.roomDropdown;
    }
    public WebElement getSelectNoOfRoom() {
        return this.selectNoOfRoom;
    }

    public WebElement getCheckInDate() {
        return this.checkInDate;
    }
    public WebElement getCheckOutdate() {
        return checkOutdate;
    }
    public WebElement getAdultRoomDropdown() {
        return this.adultRoomDropdown;
    }
    public WebElement getSelectChildRoomDropdown() {
        return this.selectChildRoomDropdown;
    }

    public WebElement getSubmitBtn() {
        return this.submitBtn;
    }

    public void selectLocation(String optionText) throws InterruptedException {
        locationDropDown.click();
        Thread.sleep(5000);
        Select dropdown = new Select(locationDropDown);
        dropdown.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void selectHotel(String optionText) throws InterruptedException {
        hotelDropdown.click();
        Thread.sleep(5000);
        Select hotelDrop = new Select(hotelDropdown);
        hotelDrop.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void selectRoomType(String optionText) throws InterruptedException {
        roomDropdown.click();
        Thread.sleep(5000);
        Select roomTypeDrop = new Select(roomDropdown);
        roomTypeDrop.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void selectNoOfRooms(String optionText) throws InterruptedException {
        selectNoOfRoom.click();
        Thread.sleep(5000);
        Select selectRooms = new Select(selectNoOfRoom);
        selectRooms.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void checkInDate(String enterInDate){
        if (getCheckInDate().isDisplayed()){
            getCheckInDate().sendKeys(enterInDate);
        }
    }
    public void checkOutDate(String enterOutDate){
        if (getCheckOutdate().isDisplayed()){
            getCheckOutdate().sendKeys(enterOutDate);
        }
    }

    public void selectAdultRoom(String optionText) throws InterruptedException {
        adultRoomDropdown.click();
        Thread.sleep(4000);
        Select selectAdultRoom = new Select(adultRoomDropdown);
        selectAdultRoom.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void selectChildRoom(String optionText) throws InterruptedException {
        selectChildRoomDropdown.click();
        Thread.sleep(5000);
        Select selectChildRoom = new Select(selectChildRoomDropdown);
        selectChildRoom.selectByVisibleText(optionText);
        Thread.sleep(5000);
    }

    public void clickSubmitBtn(){
        if (getSubmitBtn().isDisplayed()){
            getSubmitBtn().click();
        }
    }

}
