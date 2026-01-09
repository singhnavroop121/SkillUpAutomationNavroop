import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
//test-1
@Test
public void loginWithvalidEmail() throws InterruptedException {

    //Navigate to koel App
    navigateToKoelApp();
    //enter valid email address
    provideEmail("student@skillup.study");
    //enter valid password
    providePassword("Intern$hip001");
    //click submit button
    clickLoginBtn();

    //helper methods
    WebElement logoutBtn=driver.findElement(By.xpath("//img[@alt='Avatar of c25d9296833a4a9f87c2ea07b1d917eb']"));
    Assert.assertTrue(logoutBtn.isDisplayed());
    Thread.sleep(2000);

}
//test2
@Test
public void loginWithInvalidEmail() throws InterruptedException {

    //Navigate to koel App
    navigateToKoelApp();
    //enter valid email address
    provideEmail("test@skillup.study");
    //enter valid password
    providePassword("Intern$hip001");
    //click submit button
    clickLoginBtn();
    //helper methods
    WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
    Assert.assertTrue(forgetpasswordBtn.isDisplayed());
    Thread.sleep(2000);


    }

    //test-3
    @Test
    public void loginWithInvalidPassword() throws InterruptedException {

        //Navigate to koel App
        navigateToKoelApp();
        //enter valid email address
        provideEmail("student@skillup.study");
        //enter valid password
        providePassword("Intern$hip");
        //click submit button
        clickLoginBtn();
        //helper methods
        WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
        Assert.assertTrue(forgetpasswordBtn.isDisplayed());
        Thread.sleep(2000);

    }

       //test-4
@Test
    public void loginWithEmptyField() throws InterruptedException {

    //Navigate to koel App
    navigateToKoelApp();
    //enter valid email address
    provideEmail("");
    //enter valid password
    providePassword("");
    //click submit button
    clickLoginBtn();
    //helper methods
    WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
    Assert.assertTrue(forgetpasswordBtn.isDisplayed());
    Thread.sleep(2000);

}

//test-5 logout varification
@Test
    public void logoutVarification() throws InterruptedException {

    //Navigate to koel App
    navigateToKoelApp();
    //enter valid email address
    provideEmail("student@skillup.study");
    //enter valid password
    providePassword("Intern$hip001");
    //click submit button
    clickLoginBtn();

    //helper methods
    //varify logo image at login page
   WebElement logo= driver.findElement(By.xpath("//img[@class='inline-block']"));
   Assert.assertTrue(logo.isDisplayed());


    }

    }



