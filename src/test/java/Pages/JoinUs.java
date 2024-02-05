package Pages;
import org.openqa.selenium.By;


import static Tests.SeleniumTest.driver;

public class JoinUs {
    public static String create_account_class = "x-el x-el-a c2-4p c2-4q c2-i c2-j c2-k c2-1d c2-m c2-3 c2-1x c2-4 c2-4r c2-4s c2-4t c2-5 c2-6 c2-7 c2-8";
    public static String first_name_xpath = "//*[@id=\"bs-6\"]/span/div/div/div/form/div[1]/input";
    public static String last_name_xpath = "//*[@id=\"bs-6\"]/span/div/div/div/form/div[2]/input";
    public static String email_box_xpath = "//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/input";
    public static String phone_xpath = "//*[@id=\"bs-6\"]/span/div/div/div/form/div[4]/input";

    public static String create_account_box_xpath1 = "//*[@id=\"bs-6\"]/span/div/div/div/form/div[6]/button";


    public static void createAccount_click() {
        driver.findElement(By.cssSelector(create_account_class)).click();
    }
    public static void enter_first_name() {
        driver.findElement(By.xpath(first_name_xpath)).click();
        driver.findElement(By.xpath(first_name_xpath)).sendKeys("Test");
    }

    public static void enter_last_name() {
        driver.findElement(By.xpath(last_name_xpath)).click();
        driver.findElement(By.xpath(last_name_xpath)).sendKeys("User");
    }

    public static void enter_email() {
        driver.findElement(By.xpath(email_box_xpath)).click();
        driver.findElement(By.xpath(email_box_xpath)).sendKeys("testuser5@gmail.com");
    }

    public static void enter_phoneNumber() {
        driver.findElement(By.xpath(phone_xpath)).click();
        driver.findElement(By.xpath(phone_xpath)).sendKeys("0032123456789");

    }
    public static void create_account_click() {

        driver.findElement(By.xpath(create_account_box_xpath1)).click();
    }

}

