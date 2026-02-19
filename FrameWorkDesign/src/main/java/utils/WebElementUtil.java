package utils;

import org.openqa.selenium.WebElement;

public class WebElementUtil {

    public static boolean elementTobeDisplay(WebElement element)
    {
        return element.isDisplayed();
    }

    public static boolean elementTobeSelected(WebElement element)
    {
        return element.isSelected();
    }
    public static boolean elementEnabled(WebElement element)
    {
        return element.isEnabled();
    }
}
