package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ProjectSection {
    public Button addProjectButton = new Button(By.xpath("//button[contains(@aria-label, 'dir proyecto')]"));
    public Label nameProjectLabel;

    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a[contains(@aria-label, '"+nameProject+"')]"));
        projectCreated.click();
    }

    public void rightClickOnProject(String nameProject) {
        Label projectCreated = new Label(By.xpath("//a[contains(@aria-label, '"+nameProject+"')]"));
        projectCreated.rightClick();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        nameProjectLabel = new Label(By.xpath("//a[contains(@aria-label, '"+nameProject+"')]"));
        return nameProjectLabel.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a[contains(@aria-label, '"+nameProject+"')]"));
        return projectCreated;
    }
}
