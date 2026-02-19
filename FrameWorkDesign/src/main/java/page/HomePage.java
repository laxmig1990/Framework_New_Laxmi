package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtil;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "(//li[@class='icon-menu'])[2]")
    WebElement Icon;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement AcceptCookie;

    @FindBy(xpath = "//*[@id=\"el_10HCLG25lX\"]")
    WebElement Cancel;

    public HomePage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void ClickonCookie()
    {
        WaitUtil.waituntillElementTobeClickable(AcceptCookie,driver);
        WaitUtil.waitUntillElementVisible(Cancel,driver);
    }
    public void ClickLogo()
    {
        WaitUtil.waituntillElementTobeClickable(Icon,driver);
    }
}
