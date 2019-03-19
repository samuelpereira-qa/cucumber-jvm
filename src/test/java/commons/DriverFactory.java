package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static WebDriver getNewInstance() {
        System.setProperty("webdriver.chrome.driver", "/Users/sppereira/Documents/workspace/poc-bestpratices/src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        drivers.set(driver);
        return getCurrentInstance();
    }

    public static WebDriver getCurrentInstance() {
        return drivers.get();
    }
}
