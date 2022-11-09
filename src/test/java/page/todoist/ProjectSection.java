package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ProjectSection {
    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='Añadir proyecto']"));
    public Label nameProjectLabel;

    public Label createNameProjectLabel(String name) {
        nameProjectLabel = new Label(By.xpath("//a[contains(@aria-label, '"+name+"')]"));
        return nameProjectLabel;
    }
}
