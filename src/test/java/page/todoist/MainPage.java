package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Label loginLabel = new Label(By.xpath("//ul//a[contains(text(), 'Iniciar')]"));
}
