package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import PageObject.LoginPage;
import PageObject.SearchHotelPage;
import Utils.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BasePage {


    static Properties prop;
    static WebDriver driver;

    protected static LoginPage loginPage;
    protected static SearchHotelPage searchHotelPage;
    public BasePage(){
        try {
            prop = new Properties();

            FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\Downloads\\USSDJavaApplication-Master\\AdactinHotelApp\\src\\main\\" +
                    "java\\Config\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     @BeforeTest
    public static void launchApp(){


        String browserName =prop.getProperty("browser");

        if(browserName.equals("chrome")){
            driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
        }
        else if (browserName.equals("edge")){
            driver = new EdgeDriver();
            WebDriverManager.edgedriver().setup();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://adactinhotelapp.com/index.php");
        loginPage = new LoginPage(driver);
        searchHotelPage = new SearchHotelPage(driver);

    }

    @AfterTest
    public void tearUp(){
        driver.quit();
    }


}
