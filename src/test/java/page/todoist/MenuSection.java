package page.todoist;

import control.TextBox;
import org.openqa.selenium.By;

public class MenuSection {
    public TextBox searchTxtBox = new TextBox(By.xpath("//input[@placeholder='Buscar']"));
}
