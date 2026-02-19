package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;

public class MouseUtil {

    public static Actions actions;


    public void mouseHover(WebElement element, WebDriver driver)
    {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void rightClick(WebElement element,WebDriver driver)
    {
        actions= new Actions(driver);
        actions.contextClick(element).perform();
    }
    public void DragnDrop(WebElement src,WebElement dst , WebDriver driver)
    {
        actions= new Actions(driver);
        actions.dragAndDrop(src,dst).perform();
    }
    public void Click(WebElement element, WebDriver driver)
    {
        actions= new Actions(driver);
        actions.click(element).perform();
    }

}
