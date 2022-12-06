package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MessageSection {
    public TextBox recipientTxtBox = new TextBox(By.id("msgto"));
    public TextBox subjectTxtBox = new TextBox(By.id("msgsubject"));
    public TextBox messageBodyTxtBox = new TextBox(By.id("msgbody"));
    public Button sendEmailButton = new Button(By.id("msgsend"));
}
