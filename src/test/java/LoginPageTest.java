import BaseTest.BasePage;
import PageObject.SearchHotelPage;
import com.aventstack.extentreports.reporter.configuration.Theme;
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
        Thread.sleep(3000);
        searchHotelPage.selectHotel("Hotel Hervey");
        Thread.sleep(500);
        searchHotelPage.selectRoomType("Deluxe");
        Thread.sleep(3000);
        searchHotelPage.selectNoOfRooms("4 - Four");
        Thread.sleep(3000);
        searchHotelPage.checkInDate("07/01/2024");
        Thread.sleep(3000);
        searchHotelPage.checkOutDate("09/01/2024");
        Thread.sleep(3000);
        searchHotelPage.selectAdultRoom("2 - Two");
        Thread.sleep(3000);
        searchHotelPage.selectChildRoom("3 - Three");
        Thread.sleep(3000);
        searchHotelPage.clickSubmitBtn();
        Thread.sleep(4000);
        selectHotelPage.clickSelectHotelRadiobtn();
        Thread.sleep(4000);
    }


}
