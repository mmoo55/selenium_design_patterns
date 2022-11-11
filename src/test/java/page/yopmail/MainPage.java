package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox emailLoginTxtBox = new TextBox(By.id("login"));
    public Button sendEmailLoginButton = new Button(By.xpath("//button"));
}
