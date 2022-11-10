package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateUpdateDeleteProjectSection {
    public TextBox nameTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addSaveDeleteButton = new Button(By.xpath("//button[@type='submit']"));
}
