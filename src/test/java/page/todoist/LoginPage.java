package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@placeholder='Introduce tu email...']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@placeholder='Introduce tu contraseña...']"));
    public Button iniciarSesionButton = new Button(By.xpath("//form/button"));

    public void login(String email, String pwd){
        emailTxtBox.setText(email);
        passwordTxtBox.setText(pwd);
        iniciarSesionButton.click();
    }
}
