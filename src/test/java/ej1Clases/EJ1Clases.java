package ej1Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

import java.util.Date;

public class EJ1Clases {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
        //driver = new ChromeDriver();

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(chrome_options);

        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void cleanup(){
        driver.quit();
    }

    @Test
    public void EJ1Clases() throws InterruptedException {
        // login
        driver.findElement(By.xpath("//img[contains(@src,'pagelogin')]")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("bootcamp@mojix44.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed()
                ,"ERROR login was incorrect");

        // create
        String nameProject="GersonMojix"+new Date().getTime();
        driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys(nameProject);
        driver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(1000);
        int actualResult=driver.findElements(By.xpath(" //td[text()='"+nameProject+"'] ")).size();
        Assertions.assertTrue(actualResult >= 1
                ,"ERROR The project was not created");

        // create task
        String nameTask = "Test task";
        driver.findElement(By.id("NewItemContentInput")).click();
        driver.findElement(By.id("NewItemContentInput")).sendKeys(nameTask);
        driver.findElement(By.id("NewItemAddButton")).click();

        Thread.sleep(1000);

        // update task
        String nameTaskUpdated = "New name";
        driver.findElement(By.xpath("//div[@onclick='ProjectSelected(this);']//td[text()='"+ nameProject +"']")).click();
        driver.findElement(By.xpath("//td[@class='MainTableRight']//div[text()='"+nameTask+"']")).click();
        driver.findElement(By.xpath("//div[@class='ItemContentDiv UnderEditingItem']//textarea[@id='ItemEditTextbox']")).clear();
        driver.findElement(By.xpath("//div[@class='ItemContentDiv UnderEditingItem']//textarea[@id='ItemEditTextbox']")).sendKeys(nameTaskUpdated, Keys.ENTER);

    }

}
