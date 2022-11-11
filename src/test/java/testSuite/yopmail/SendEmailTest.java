package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class SendEmailTest extends TestBase{

     @Test
    public void verifySentEmail(){
         String emailAddress = email+"@yopmail.com";
         String emailSubject = "Prueba " + new Date().getTime();
         String emailMessageBody = "Prueba";

         String firstFrame;

         mainPage.emailLoginTxtBox.setText(email);
         mainPage.sendEmailLoginButton.click();
         Assertions.assertTrue(emailSection.emailTitle.isControlDisplayed(), "ERROR! the login was faield");

         emailSection.newMailButton.click();
         //Session.getInstance().getBrowser().switchTo().frame("ifmail");
         //Session.getInstance().changeFrame("ifinbox");
         Session.getInstance().changeFrame("ifmail");

         messageSection.recipientTxtBox.setText(emailAddress);
         messageSection.subjectTxtBox.setText(emailSubject);
         messageSection.messageBodyTxtBox.setText(emailMessageBody);
         Assertions.assertTrue(messageSection.popMessageLabel.isControlDisplayed(), "ERROR! the message was not sent");

         //Session.getInstance().getBrowser().switchTo().defaultContent();
         Session.getInstance().changeFrame("ifinbox");
         emailSection.refreshButton.click();
         Assertions.assertTrue(emailSection.emailButton.isControlDisplayed(), "ERROR! the message was not sent");


     }
}
