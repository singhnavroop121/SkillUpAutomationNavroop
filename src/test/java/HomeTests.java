import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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


        //click view all btn
        clickviewAllBtn();


        //select first song
        selectFirstSong();


        //click add to btn
        clickAddToBtn();


        //select playlist
        SelectPlayList();


        successMsg();


    }

    //helper methods

    public void successMsg() {
        WebElement successMsgPopup = driver.findElement(By.xpath("//div[@class='popover']"));
        Assert.assertTrue(successMsgPopup.isDisplayed());
    }

    private void SelectPlayList() {

       WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/section[3]/header/main/div[2]/div/div[2]/div/div[1]/section/ul/li[4]")));
        playlist.click();

    }

    private void clickAddToBtn() {

       WebElement addBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add To…']")));
        addBtn.click();
    }

    private void selectFirstSong() {

       WebElement clickFirstSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/section[12]/main/div/div[2]/div/div/div[1]/article")));
        clickFirstSong.click();
    }

    private void clickviewAllBtn() {

        WebElement viewAllBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='view-all-songs-btn']")));
        viewAllBtn.click();
    }

    private void searchsongfield() {

       WebElement searchfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));

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

       WebElement changeIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-title='Play or resume'][@title='Pause']")));
        Assert.assertTrue(changeIcon.isDisplayed());
    }

    private void clickOnplayButton() {

       WebElement playBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-title='Play or resume']")));
        playBtn.click();
    }

}