package steps_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
 public static WebDriver driver;
    @Before
public static void open_browser()
    {

        System.setProperty("web-driver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quit_browser()
    {
        driver.quit();
    }
}

