import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://demo.koel.dev/#home/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }

@Test
    public void loginValidEmailPassword() throws InterruptedException {
        //pre-condn browser must be open
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        String url = "http://testkoel.skillup.study/#home/";
        driver.get(url);
        //step2 : enter valid email address

        WebElement enterEmail = driver.findElement(By.xpath("//input[@type='email']"));
        enterEmail.click();
        enterEmail.clear();
    Thread.sleep(2000);
        enterEmail.sendKeys("student@skillup.study");
        Thread.sleep(2000);

// step3
        WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
        enterPassword.click();
        enterPassword.clear();
        enterPassword.sendKeys("Intern$hip001");


        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement profileIcon = driver.findElement(By.xpath("//button[@data-title='Log out']"));
        Assert.assertTrue(profileIcon.isDisplayed());






    }


}
