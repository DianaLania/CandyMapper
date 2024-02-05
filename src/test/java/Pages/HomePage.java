package Pages;
import org.openqa.selenium.By;
import static Tests.SeleniumTest.driver;

public class HomePage {
    public static String closePopUp_id = "popup-widget10983-close-icon";

    public static String joinUs_xpath = "JOIN US";


    public static void click_PopUpClose_Icon() {
        
        driver.findElement(By.id(closePopUp_id)).click();

    }
    public static void click_joinUs_link() {
        driver.findElement(By.linkText(joinUs_xpath)).click();
    }
}

