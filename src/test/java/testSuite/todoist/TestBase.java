package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetPropertiesTodoist;

public class TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    MenuProjectSection menuProjectSection = new MenuProjectSection();
    ProjectSection projectSection = new ProjectSection();

    CreateUpdateDeleteProjectSection createUpdateDeleteProjectSection = new CreateUpdateDeleteProjectSection();

    MenuSection menuSection = new MenuSection();

    TaskModalSection taskModalSection = new TaskModalSection();
    TaskModalMenu taskModalMenu = new TaskModalMenu();
    TaskSection taskSection = new TaskSection();

    // todo property file
    String user=GetPropertiesTodoist.getInstance().getUser();
    String password =GetPropertiesTodoist.getInstance().getPwd();


    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}
