package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskModalSection {
    public Label nameTaskLabel;

    public TextBox editTaskTxtBox = new TextBox(By.xpath("//div[@data-dialog]//div[contains(@class, 'public-DraftStyleDefault-block')]"));
    public Button saveTaskButton = new Button(By.xpath("//div[@data-dialog]//button[@type='submit']/span[text()='Guardar']"));
    public Button closeTaskModalButton = new Button(By.xpath("//button[@aria-label = 'Cerrar ventana']"));
    public Button taskModalMenuButton = new Button(By.xpath("//div[@data-dialog]//div[@data-testid='button-container']//button[@aria-haspopup='menu']"));

    public TaskModalSection(){}

    public void clickOnTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[@role='button']/div[text()='"+nameTask+"']"));
        taskCreated.click();
    }

    public void rightClickOnProject(String nameTask) {
        Label taskCreated = new Label(By.xpath("//div[@role='button']/div[text()='"+nameTask+"']"));
        taskCreated.rightClick();
    }

    public boolean isProjectDisplayedInList(String nameTask){
        nameTaskLabel = new Label(By.xpath("//div[@role='button']/div[text()='"+nameTask+"']"));
        return nameTaskLabel.isControlDisplayed();
    }

    public Label getTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[@role='button']/div[text()='"+nameTask+"']"));
        return taskCreated;
    }
}
