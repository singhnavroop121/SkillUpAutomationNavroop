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

        //assert result
        turnPlayBtn();


    }

    private void turnPlayBtn() {

        WebElement changeIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-title='Play or resume'][@title='Pause']")));
        Assert.assertTrue(changeIcon.isDisplayed());
    }

    private void clickOnplayButton() {

        WebElement playBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-title='Play or resume']")));
        playBtn.click();
    }


    @Test
    public void hoverAddToOption() throws InterruptedException {
        //login with valid credentials
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();

        //click on all songs
        clickAllSongsBtn();
        //right click on first song from the list
        contextClickOnFirstSong();
        //hover to add to option
        hoverOnAddToOptipon();
        //select test option
        ClickOnTestOption();
        //success message
        successMsgPopover();


    }
     public void successMsgPopover() {
        WebElement successMsgPopup = wait.until(ExpectedConditions.visibilityOfElementLocated
            (By.xpath("//div[@class='popover']")));
  Assert.assertTrue(successMsgPopup.isDisplayed());
   }

    private void ClickOnTestOption() {
        WebElement selectTestOption = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//template[@class='block']")));
        actions.click(selectTestOption).perform();
    }

    private void hoverOnAddToOptipon() {
        WebElement hoverOnAddTo = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//li[@class='has-sub']")));

        actions.moveToElement(hoverOnAddTo).perform();

    }

    private void contextClickOnFirstSong() {
        WebElement contextClick = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[@id='mainContent']/section[3]/main/div/div[2]/div/div/div[1]/article")));

        actions.contextClick(contextClick).perform();
    }

    private void clickAllSongsBtn() {
        WebElement allSongBtn = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//a[@href='/#/songs']")));

        actions.click(allSongBtn).perform();
    }

    
    @Test
    public void doubleClickPlaySong() throws InterruptedException {

        //login
        provideEmail("student@skillup.study");
        providePassword("Intern$hip001");
        clickLoginBtn();

        //select allSongs
        clickAllSongsBtn();
        //play song with double click
        doubleClickToPlay();
        //assert result
        turnPlayBtn();

    }

    private void doubleClickToPlay() {
        WebElement doubleClickOnSong =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/section[3]/main/div/div[2]/div/div/div[1]/article")));
    actions.doubleClick(doubleClickOnSong).perform();

    }

}


