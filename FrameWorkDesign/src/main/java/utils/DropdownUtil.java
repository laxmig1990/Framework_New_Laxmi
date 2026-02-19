package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtil {

    public static Select select;

    public static void selectBy(WebElement ele,int index)
    {
        select= new Select(ele);
        select.selectByIndex(index);
    }
    public static void selectBy(WebElement ele,String Value)
    {
        select= new Select(ele);
        select.selectByValue(Value);
    }
    public static void selectByName(WebElement ele,String Name)
    {
        select= new Select(ele);
        select.selectByVisibleText(Name);
    }
}
