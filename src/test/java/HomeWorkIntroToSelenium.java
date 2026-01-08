import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorkIntroToSelenium {
//test-1
@Test

public void loginWithvalidEmail() throws InterruptedException {

    //pre-conditions browser must be open

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--disable-notifications");
    WebDriver driver = new ChromeDriver(options);
    String url = "http://testkoel.skillup.study/#home/";
    driver.get(url);


    //enter valid email address
    WebElement emailField= driver.findElement(By.xpath("//input[@type='email']"));
    emailField.click();
    emailField.clear();
    Thread.sleep(2000);
    emailField.sendKeys("student@skillup.study");
    Thread.sleep(2000);

    //enter valid password
    WebElement passwordField= driver.findElement(By.xpath("//input[@type='password']"));
    passwordField.click();
    passwordField.clear();
    passwordField.sendKeys("Intern$hip001");
    Thread.sleep(2000);

    //click submit button

    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    loginbtn.click();
    Thread.sleep(2000);

    WebElement logoutBtn=driver.findElement(By.xpath("//img[@alt='Avatar of c25d9296833a4a9f87c2ea07b1d917eb']"));
    Assert.assertTrue(logoutBtn.isDisplayed());
    Thread.sleep(2000);
    driver.quit();

}
@Test
public void loginWithInvalidEmail() throws InterruptedException {

    //pre-conditions browser must be open

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--disable-notifications");
    WebDriver driver = new ChromeDriver(options);
    String url = "http://testkoel.skillup.study/#home/";
    driver.get(url);

    
    //enter invalid email address
    WebElement emailField= driver.findElement(By.xpath("/html/body/div/div[2]/form/label[1]/input"));
    emailField.click();
    emailField.clear();
    Thread.sleep(2000);
    emailField.sendKeys("test@skillup.study");
    Thread.sleep(2000);

    //enter valid password
    WebElement passwordField= driver.findElement(By.xpath("//input[@type='password']"));
    passwordField.click();
    passwordField.clear();
    passwordField.sendKeys("Intern$hip001");
    Thread.sleep(2000);

    //click submit button

    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    loginbtn.click();
    Thread.sleep(2000);

    WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
    Assert.assertTrue(forgetpasswordBtn.isDisplayed());
    Thread.sleep(2000);
    driver.quit();

    }


    //test-2
    @Test
    public void loginWithInvalidPassword() throws InterruptedException {

        //pre-conditions browser must be open

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        String url = "http://testkoel.skillup.study/#home/";
        driver.get(url);

        //enter valid email address
        WebElement emailField= driver.findElement(By.xpath("//input[@type='email']"));
        emailField.click();
        emailField.clear();
        Thread.sleep(2000);
        emailField.sendKeys("student@skillup.study");
        Thread.sleep(2000);

        //enter invalid password
        WebElement passwordField= driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("Internship001");
        Thread.sleep(2000);

        //click submit button

        WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
        loginbtn.click();
        Thread.sleep(2000);

        WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
        Assert.assertTrue(forgetpasswordBtn.isDisplayed());
        Thread.sleep(2000);
        driver.quit();
    }


    //test-3
@Test
    public void loginWithEmptyField() throws InterruptedException {
    ChromeOptions options= new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--disable-notifications");
    WebDriver driver=new ChromeDriver(options);
    String url="http://testkoel.skillup.study/#home/";
    driver.get(url);

    // emailField leave empty
    WebElement emailField= driver.findElement(By.xpath("//input[@type='email']"));
    emailField.click();
    emailField.clear();
    Thread.sleep(2000);

    //password leave empty
    WebElement passwordField= driver.findElement(By.xpath("//input[@type='password']"));
    passwordField.click();
    passwordField.clear();
    Thread.sleep(2000);

    //click submit button

    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    loginbtn.click();
    Thread.sleep(2000);

    WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
    Assert.assertTrue(forgetpasswordBtn.isDisplayed());
    Thread.sleep(2000);
    driver.quit();
}

//test-4 logout varification
@Test
    public void logoutVarification() throws InterruptedException {

    ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        String url = "http://testkoel.skillup.study/#home/";
        driver.get(url);

        //enter valid email address

    WebElement emailField= driver.findElement(By.xpath("//input[@type='email']"));
    emailField.click();
    emailField.clear();
    Thread.sleep(2000);
    emailField.sendKeys("student@skillup.study");
    Thread.sleep(2000);

    //enter valid password
    WebElement passwordField= driver.findElement(By.xpath("//input[@type='password']"));
    passwordField.click();
    passwordField.clear();
    passwordField.sendKeys("Intern$hip001");
    Thread.sleep(2000);

    //click submit button

    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    loginbtn.click();
    Thread.sleep(2000);

    //click logout button
    WebElement logoutBtn=driver.findElement(By.xpath("//button[@data-title='Log out']"));
    logoutBtn.click();
    Thread.sleep(2000);

    //varify logo image at login page
   WebElement logo= driver.findElement(By.xpath("//img[@class='inline-block']"));
   Assert.assertTrue(logo.isDisplayed());
    driver.quit();

    }

    }



