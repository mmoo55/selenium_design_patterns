package control;

import org.openqa.selenium.By;

public class CheckBox extends Control{

    public CheckBox(By locator) {
        super(locator);
    }

    public void check(){
        if (!this.control.isSelected())
            this.control.click();
    }

    public void unCheck(){
        if (!this.control.isSelected())
            this.control.click();
    }
}
