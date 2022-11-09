package page.todoist;

import control.Label;
import org.openqa.selenium.By;

public class MenuProjectSection {
    public Label editProjectLabel = new Label(By.xpath("//div[text()='Editar proyecto']"));
    public Label deleteProjectLabel = new Label(By.xpath("//div[text()='Eliminar proyecto']"));
}
