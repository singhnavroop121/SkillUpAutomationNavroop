import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
//test-1
@Test
public void loginWithvalidEmail() throws InterruptedException {

    //enter valid email address
    provideEmail("student@skillup.study");
    //enter valid password
    providePassword("Intern$hip001");
    //click submit button
    clickLoginBtn();

    //helper methods
    WebElement logoutBtn=driver.findElement(By.xpath("//button[@data-title='Log out']"));
    Assert.assertTrue(logoutBtn.isDisplayed());
    Thread.sleep(2000);

}
//test2
@Test(dataProvider = "NegativeLoginTestData",dataProviderClass = TestNGDataProvider.class)
public void neagativeLoginTests(String email,String password) throws InterruptedException {

    //enter valid email address
    provideEmail(email);
    //enter valid password
    providePassword(password);
    //click submit button
    clickLoginBtn();
    //helper methods
    WebElement forgetpasswordBtn=driver.findElement(By.xpath("//a[@role='button']"));
    Assert.assertTrue(forgetpasswordBtn.isDisplayed());
    Thread.sleep(2000);



}

//test-3 logout varification
@Test
    public void logoutVarification() throws InterruptedException {

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



