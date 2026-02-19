package pageTest;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.PropertyReaderUtil;

import java.io.IOException;
import java.util.Base64;

public class LoginTest extends BaseTest {

    @Test
    public void VerifyLogin() throws IOException {
        homepage.ClickonCookie();
        homepage.ClickLogo();
        loginpage.setCredentials(PropertyReaderUtil.getData("username"),PropertyReaderUtil.getData("password"));
       // loginpage.setCredentials("username","password");
    }

}
