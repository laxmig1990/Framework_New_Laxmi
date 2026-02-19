package testBase;

import constants.Browsers;
import constants.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertyReaderUtil;

import java.io.IOException;
import java.time.Duration;

public class WebTestBase {

    public static WebDriver driver;

    public void initilization() throws IOException {
        String browser = PropertyReaderUtil.getData("browser");
        if(browser.equalsIgnoreCase(Browsers.CHROME.toString()))
        {
            driver= new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase(Browsers.FIREFOX.toString()))
        {
            driver= new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase(Browsers.EDGE.toString()))
        {
            driver= new EdgeDriver();
        }
        else {
            System.out.println("Enter the valid browsername");
        }

        driver.get(PropertyReaderUtil.getData("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Waits.PAGE_LOAD_TIMEOUT.getCode()));

    }
}
