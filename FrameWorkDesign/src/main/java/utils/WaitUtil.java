package utils;

import constants.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtil {

    public static WebDriverWait wait;

    public static void waituntillElementTobeClickable(WebElement ele, WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Waits.EXPLICIT_WAIT.getCode()));
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }

    public static void waitUntillElementVisible(WebElement ele,WebDriver driver)
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(Waits.EXPLICIT_WAIT.getCode()));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }


}
