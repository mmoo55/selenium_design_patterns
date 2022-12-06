package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class EmailSection {
    public Label emailTitle = new Label(By.xpath("//div[@class='bname']"));
    public Button newMailButton = new Button(By.id("newmail"));
    public Button refreshButton = new Button(By.id("refresh"));
    public Label emailLabel = new Label(By.xpath("//div[@currentmail]"));
}
