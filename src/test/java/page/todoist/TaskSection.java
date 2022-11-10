package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSection {
    public Label addTaskLabel = new Label(By.xpath("//button[@class='plus_add_button']"));
    public TextBox nameTaskTxtBox = new TextBox(By.xpath("//div[contains(@class, 'public-DraftStyleDefault-block')]"));
    public Button addTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));
    public Label nameTaskLabel;

    public TaskSection(){}

    public void clickOnTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        taskCreated.click();
    }

    public void rightClickOnProject(String nameTask) {
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        taskCreated.rightClick();
    }

    public boolean isProjectDisplayedInList(String nameTask){
        nameTaskLabel = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return nameTaskLabel.isControlDisplayed();
    }

    public Label getTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated;
    }
}
