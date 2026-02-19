package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import utils.WaitUtil;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "(//input[@class='slds-input input-element'])[1]")
    WebElement uname;

    @FindBy(xpath = "(//input[@class='slds-input input-element'])[2]")
    WebElement pwd;

    @FindBy(xpath="//button[@class='login-button slds-button']")
    WebElement Loginbtn;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setCredentials(String username, String password)
    {
        WaitUtil.waitUntillElementVisible(uname,driver);
        uname.sendKeys(username);
        WaitUtil.waitUntillElementVisible(uname,driver);
        uname.sendKeys(password);
        WaitUtil.waituntillElementTobeClickable(Loginbtn,driver);
        Loginbtn.click();

    }


}
