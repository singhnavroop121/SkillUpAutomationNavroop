import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddSong extends BaseTest {


        @Test
        public void AddSongToPlaylistTest() throws InterruptedException {

            //navigate to koel app
            navigateToKoelApp();

            //login with valid credentials
            provideEmail();
            providePassword();
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

        }

        //helper methods
    private void SelectPlayList() {
        WebElement playlist= driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/section/section[12]/header/main/div[2]/div[2]/div/div[1]/section/ul/li[3]"));
        playlist.click();

    }

    private void clickAddToBtn() {
        WebElement addBtn= driver.findElement(By.xpath("//*[@id='mainContent']/section[12]/header/main/div[2]/div[1]/span[1]/button[2]"));
        addBtn.click();
        }

    private void selectFirstSong() {
        WebElement clickFirstSong= driver.findElement(By.xpath("//*[@id='mainContent']/section[12]/main/div/div[2]/div/div/div[1]/article"));
        clickFirstSong.click();
    }

    private void clickviewAllBtn() {
        WebElement viewAllBtn= driver.findElement(By.xpath("//button[@data-testid='view-all-songs-btn']"));
        viewAllBtn.click();
    }

    private void searchsongfield() {
        WebElement searchfield= driver.findElement(By.xpath("//input[@name='q']"));
        searchfield.click();
        searchfield.clear();
        searchfield.sendKeys("Epic Song");


    }
}
