package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Chrome implements IBrowser{

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
        //driver = new ChromeDriver();

        ChromeOptions chrome_options = new ChromeOptions();
        //chrome_options.addArguments("--headless");
        chrome_options.addArguments("--no-sandbox");
        //chrome_options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(chrome_options);
        // implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // page load wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        return driver;
    }
}
