package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTestTodoist extends TestBase{

    @Test
    public void verifyCRUDProject() throws InterruptedException {
        String projectCreated = "Prueba" + new Date().getTime();
        String projectUpdated = "Nuevo nombre" + new Date().getTime();

        mainPage.loginLabel.click();
        loginPage.login(user, password);
        Assertions.assertTrue(menuSection.searchTxtBox.isControlDisplayed(), "ERROR! the login was faield");

        // CREATE
        projectSection.addProjectButton.click();
        createUpdateDeleteProjectSection.nameTxtBox.setText(projectCreated);
        createUpdateDeleteProjectSection.addSaveDeleteButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! the project was not created");

        // UPDATE
        projectSection.rightClickOnProject(projectCreated);
        menuProjectSection.editProjectLabel.click();
        createUpdateDeleteProjectSection.nameTxtBox.cleanSetText(projectUpdated);
        createUpdateDeleteProjectSection.addSaveDeleteButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! the project was not updated");

        // DELETE
        projectSection.rightClickOnProject(projectUpdated);
        menuProjectSection.deleteProjectLabel.click();
        createUpdateDeleteProjectSection.addSaveDeleteButton.click();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! the project was not deleted");


    }
}
