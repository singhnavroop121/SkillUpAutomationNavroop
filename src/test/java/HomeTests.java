import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class HomeTests extends BaseTest {
    //test-1 add song to test playlist
    @Test
    public void AddSongToPlaylistTest() throws InterruptedException {

        //navigate to koel app
        //navigateToKoelApp();

        //login with valid credentials
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();

        //search song
        searchsongfield();
        Thread.sleep(1000);

        //click view all btn
        clickviewAllBtn();
        Thread.sleep(1000);

        //select first song
        selectFirstSong();
        Thread.sleep(1000);

        //click add to btn
        clickAddToBtn();
        Thread.sleep(1000);

        //select playlist
        SelectPlayList();
        Thread.sleep(1000);

        successMsg();
        Thread.sleep(1000);

    }

    //helper methods

    public void successMsg() {
        WebElement successMsgPopup = driver.findElement(By.xpath("//div[@class='popover']"));
        Assert.assertTrue(successMsgPopup.isDisplayed());
    }

    private void SelectPlayList() {
        WebElement playlist = driver.findElement(By.xpath("//*[@id='mainContent']/section[12]/header/main/div[2]/div[2]/div/div[1]/section/ul/li[5]"));
        playlist.click();

    }

    private void clickAddToBtn() {
        WebElement addBtn = driver.findElement(By.xpath("//button[normalize-space()='Add To…']"));
        addBtn.click();
    }

    private void selectFirstSong() {
        WebElement clickFirstSong = driver.findElement(By.xpath("//*[@id='mainContent']/section[12]/main/div/div[2]/div/div/div[1]/article"));
        clickFirstSong.click();
    }

    private void clickviewAllBtn() {
        WebElement viewAllBtn = driver.findElement(By.xpath("//button[@data-testid='view-all-songs-btn']"));
        viewAllBtn.click();
    }

    private void searchsongfield() {
        WebElement searchfield = driver.findElement(By.xpath("//input[@name='q']"));
        searchfield.click();
        searchfield.clear();
        searchfield.sendKeys("Epic Song");
    }

    //test-2 play song
    @Test
    public void play() throws InterruptedException {
        
        //login with valid credentials
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();

        //click on play button
        clickOnplayButton();
        Thread.sleep(1000);
        //assert result
        turnPlayBtn();
        Thread.sleep(1000);

    }

    private void turnPlayBtn() {
        WebElement changeIcon = driver.findElement(By.xpath("//button[@data-title='Play or resume'][@title='Pause']"));
        Assert.assertTrue(changeIcon.isDisplayed());
    }

    private void clickOnplayButton() {
        WebElement playBtn = driver.findElement(By.xpath("//button[@data-title='Play or resume']"));
        playBtn.click();
    }


//test-3 update profile name


    /*public void changeProfileNameTest() throws InterruptedException {
        //navigate to koel app
       // navigateToKoelApp();

        //login with valid credentials
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();

        //click profile icon
        clickProfileIconBtn();
        Thread.sleep(2000);
        //create random name
        String randomName= generateRandomName();
        System.out.println("random name is: "+randomName);
        Thread.sleep(2000);
        //enter current password
        provideCurrentPassword();
        Thread.sleep(2000);
        provideNewPassword();
        Thread.sleep(2000);
        //entre profile name
        provideProfileName(randomName);
        Thread.sleep(2000);
        //enter email
        provideProfileEmail();
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


    public void provideCurrentPassword() {
        WebElement currentPasswordField = driver.findElement(By.xpath("//input[@data-testid='currentPassword']"));
        currentPasswordField.click();
        currentPasswordField.clear();
        currentPasswordField.sendKeys("Intern$hip001");
    }

    public void provideNewPassword() {
        WebElement newPasswordField = driver.findElement(By.xpath("//input[@data-testid='newPassword']"));
        newPasswordField.click();
        newPasswordField.clear();
        newPasswordField.sendKeys("Intern$hip001");
    }
    public void provideProfileName(String newName) {
        WebElement profileNameField = driver.findElement(By.xpath("//input[@data-testid='name']"));
        profileNameField.click();
        profileNameField.clear();
        profileNameField.sendKeys(newName);

    }

    public void provideProfileEmail() {
        WebElement profileEmailField = driver.findElement(By.xpath("//input[@data-testid='email']"));
        profileEmailField.click();
        profileEmailField.clear();
        profileEmailField.sendKeys("student@skillup.study");
    }

    public String generateRandomName() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public void clickProfileIconBtn() {
        WebElement savebtn = driver.findElement(By.xpath("//a[@data-title='Profile and preferences']"));
        savebtn.click();
    }
    }
*/
}