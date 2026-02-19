package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.LoginPage;
import testBase.WebTestBase;

import java.io.IOException;

public class BaseTest extends WebTestBase {

    public static HomePage homepage;
    public static LoginPage loginpage;

    @BeforeMethod
    public void setup() throws IOException {
        initilization();
        homepage=new HomePage(driver);
        loginpage=new LoginPage(driver);

    }

    @AfterMethod
    public void TearDown()
    {
      //  driver.close();
    }
}
