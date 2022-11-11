package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.*;
import session.Session;
import util.GetPropertiesYopmail;

public class TestBase {
    MainPage mainPage = new MainPage();
    EmailSection emailSection = new EmailSection();
    MessageSection messageSection = new MessageSection();

    // todo property file
    String email=GetPropertiesYopmail.getInstance().getEmail();


    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}
