import BaseTest.BasePage;
//import PageObject.SearchHotelPage;
//import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {

    @Test (priority = 0, description = "Adaction Hotel Login")
    public void testLogin() throws InterruptedException {
        loginPage.enterUserName("Maganyela");
        loginPage.enterPassword("925CK7");
        loginPage.clickLoginbtn();
        Thread.sleep(5000);
    }

    @Test (priority = 1, description = "Adaction Hotel Search")
    public void testSearch() throws InterruptedException {
        searchHotelPage.selectLocation("Sydney");
        Thread.sleep(30);
        searchHotelPage.selectHotel("Hotel Hervey");
        Thread.sleep(50);
        searchHotelPage.selectRoomType("Deluxe");
        Thread.sleep(30);
        searchHotelPage.selectNoOfRooms("4 - Four");
        Thread.sleep(30);
        searchHotelPage.checkInDate("07/01/2024");
        Thread.sleep(30);
        searchHotelPage.checkOutDate("09/01/2024");
        Thread.sleep(30);
        searchHotelPage.selectAdultRoom("2 - Two");
        Thread.sleep(30);
        searchHotelPage.selectChildRoom("3 - Three");
        Thread.sleep(30);
        searchHotelPage.clickSubmitBtn();
        Thread.sleep(40);

    }
    @Test(priority = 2, description = "Adaction Hotel select Hotel")
    public void testSelect() throws InterruptedException {
        selectHotelPage.clickselectHotelRadioBtn();
        Thread.sleep(4000);
        selectHotelPage.clickContinue();
        Thread.sleep(4000);
    }
}
