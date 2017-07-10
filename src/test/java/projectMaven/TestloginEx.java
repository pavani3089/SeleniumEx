package projectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/9/17.
 */
public class TestloginEx {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
    }

    @Test
    public void test1() throws InterruptedException {

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("xyz");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("abc");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("xyz.abc@gmail.com");

        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("*****");

        WebElement m = driver.findElement(By.name("birthday_month"));
        Select month = new Select(m);
        month.selectByVisibleText("May");

        WebElement d = driver.findElement(By.name("birthday_day"));
        Select day = new Select(d);
        day.selectByValue("15");

        WebElement y = driver.findElement(By.name("birthday_year"));
        Select year = new Select(y);
        year.selectByVisibleText("1995");

        WebElement sex = driver.findElement(By.name("sex"));
        sex.click();

        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();
        Thread.sleep(5000);

    }

    @AfterTest
    public void tearDrop(){
        driver.quit();
    }

}
