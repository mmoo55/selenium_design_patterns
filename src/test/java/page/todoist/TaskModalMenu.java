package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class TaskModalMenu {
    public Button deleteTaskButton = new Button(By.xpath("//button[contains(@aria-label,'Eliminar')]"));
}
