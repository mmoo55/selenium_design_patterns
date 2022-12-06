package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class SendEmailTest extends TestBase{

     @Test
    public void verifySentEmail() {

        String emailAddress = email+"@yopmail.com";
        String emailSubject = "Prueba " + new Date().getTime();
        String emailMessageBody = "Prueba";

        mainPage.emailLoginTxtBox.setText(email);
        mainPage.sendEmailLoginButton.click();
        Assertions.assertTrue(emailSection.emailTitle.isControlDisplayed(), "ERROR! the login was faield");

        emailSection.newMailButton.click();

        Session.getInstance().changeFrame("ifmail");
        messageSection.recipientTxtBox.setText(emailAddress);
        messageSection.subjectTxtBox.setText(emailSubject);
        messageSection.messageBodyTxtBox.setText(emailMessageBody);
        messageSection.sendEmailButton.click();

        Session.getInstance().getBrowser().switchTo().defaultContent();
        emailSection.refreshButton.click();
        Session.getInstance().changeFrame("ifinbox");
        Assertions.assertTrue(emailSection.emailLabel.isControlDisplayed(), "ERROR! the message was not sent");
     }
}
