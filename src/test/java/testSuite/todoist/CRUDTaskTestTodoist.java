package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class CRUDTaskTestTodoist extends TestBase {

    @Test
    public void verifyCRUDTask() {

        String projectCreated = "Prueba" + new Date().getTime();
        String taskCreated = "Prueba" + new Date().getTime();
        String taskUpdated = "Nuevo nombre" + new Date().getTime();

        mainPage.loginLabel.click();
        loginPage.login(user, password);
        Assertions.assertTrue(menuSection.searchTxtBox.isControlDisplayed(), "ERROR! the login was faield");

        projectSection.addProjectButton.click();
        createUpdateDeleteProjectSection.nameTxtBox.setText(projectCreated);
        createUpdateDeleteProjectSection.addSaveDeleteButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! the project was not created");

        // CREATE
        taskSection.addTaskLabel.click();
        taskSection.nameTaskTxtBox.setText(taskCreated);
        taskSection.addTaskButton.click();
        Assertions.assertTrue(taskSection.isProjectDisplayedInList(taskCreated), "ERROR! the task was not created");

        // UPDATE
        taskSection.clickOnTask(taskCreated);
        taskModalSection.clickOnTask(taskCreated);
        //taskModalSection.editTaskTxtBox.waitControlIsNotInThePage();
        taskModalSection.editTaskTxtBox.cleanSetText(taskUpdated);
        //Session.getInstance().getBrowser().manage().
        taskModalSection.saveTaskButton.click();
        taskModalSection.closeTaskModalButton.click();
        Assertions.assertTrue(taskSection.isProjectDisplayedInList(taskUpdated), "ERROR! the task was not updated");

        // DELETE
        taskSection.getTask(taskUpdated).click();
        taskModalSection.taskModalMenuButton.click();
        taskModalMenu.deleteTaskButton.click();
        createUpdateDeleteProjectSection.addSaveDeleteButton.click();
        Assertions.assertFalse(taskSection.isProjectDisplayedInList(taskUpdated), "ERROR! the task was not deleted");

    }
}
