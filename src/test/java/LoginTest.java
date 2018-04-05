import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver browser;
    private static String LOGIN = "";
    private static final String PASSWORD = "";

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test

    public void loginFacebook() {
        browser.get("https://www.facebook.com");
        browser.findElement(By.cssSelector("[type~=email]")).sendKeys(LOGIN);
        browser.findElement(By.cssSelector("#pass")).sendKeys(PASSWORD);
        browser.findElement(By.xpath(".//label[@id=\"loginbutton\"]")).click();
    }

    @AfterClass

    public void closedBrowser(){
       browser.quit();
    }
}
