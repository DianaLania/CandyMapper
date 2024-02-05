package Tests;
import Pages.HomePage;
import Pages.JoinUs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SeleniumTest {

    public static WebDriver driver;
    public static ChromeOptions options;


    @BeforeTest
    public static void Setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://candymapper.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    void HomePage_Test() {
        HomePage.click_PopUpClose_Icon();
        HomePage.click_joinUs_link();
    }


    @Test
    void CreateAccount_Test(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        JoinUs.createAccount_click ();
        JoinUs.enter_first_name();
        JoinUs.enter_last_name();
        JoinUs.enter_email();
        JoinUs.enter_phoneNumber();
        JoinUs.create_account_click();
    }
}

