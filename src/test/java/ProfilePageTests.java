import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class ProfilePageTests extends BaseTest {

@Test(dataProvider = "AddProfileTestData",dataProviderClass = TestNGDataProvider.class)
    public void changeProfileNameTest(String currentPassword,String newPassword,String newName,String profileEmail) throws InterruptedException {


        //login with valid credentials
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();
        Thread.sleep(2000);

        //click profile icon
        clickProfileIconBtn();
        Thread.sleep(2000);

        //enter current password
        provideCurrentPassword(currentPassword);
        Thread.sleep(2000);
        provideNewPassword(newPassword);
        Thread.sleep(2000);
        //entre profile name
        provideProfileName(newName);
        Thread.sleep(2000);
        //enter email
        provideProfileEmail(profileEmail);
        Thread.sleep(2000);
        //click on save button
        clickSave();
        Thread.sleep(2000);

        //varify result
        successnotification();


    }

    private void successnotification() {
        WebElement updatenotification = driver.findElement(By.xpath("//div[@class='popover']"));
        Assert.assertTrue(updatenotification.isDisplayed());
    }

    //helper methods
    public void clickSave() {
        WebElement savebtn= driver.findElement(By.xpath("//footer[@class='mt-8']//button[@type='submit']"));
        savebtn.click();
    }


    public void provideCurrentPassword(String currentPassword) {
        WebElement currentPasswordField = driver.findElement(By.xpath("//input[@data-testid='currentPassword']"));
        currentPasswordField.click();
        currentPasswordField.clear();
        currentPasswordField.sendKeys(currentPassword);
    }

    public void provideNewPassword(String newPassword) {
        WebElement newPasswordField = driver.findElement(By.xpath("//input[@data-testid='newPassword']"));
        newPasswordField.click();
        newPasswordField.clear();
        newPasswordField.sendKeys(newPassword);
    }
    public void provideProfileName(String newName) {
        WebElement profileNameField = driver.findElement(By.xpath("//input[@data-testid='name']"));
        profileNameField.click();
        profileNameField.clear();
        profileNameField.sendKeys(newName);

    }

    public void provideProfileEmail(String profileEmail) {
        WebElement profileEmailField = driver.findElement(By.xpath("//input[@data-testid='email']"));
        profileEmailField.click();
        profileEmailField.clear();
        profileEmailField.sendKeys(profileEmail);
    }

   // public String generateRandomName() {
       // return UUID.randomUUID().toString().replace("-", "");



    public void clickProfileIconBtn() {
        WebElement savebtn = driver.findElement(By.xpath("//a[@data-title='Profile and preferences']"));
        savebtn.click();
    }
}




