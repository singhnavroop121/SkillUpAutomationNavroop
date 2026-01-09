import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaySong extends BaseTest {

@Test
    public void play() throws InterruptedException {

        //navidate to koel app
          navigateToKoelApp();
        //login with valid credentials
           provideEmail();
           providePassword();
           clickLoginBtn();

        //click on play button
        clickOnplayButton();
        //assert result
        turnPlayBtn();



    }

    private void turnPlayBtn() {
    WebElement changeIcon= driver.findElement(By.xpath("//*[@id='app']/main/footer/div[3]/div[2]/div/button[3]/svg"));
        Assert.assertTrue(changeIcon.isDisplayed());
    }

    private void clickOnplayButton() {
        WebElement playBtn= driver.findElement(By.xpath("//button[@data-title='Play or resume']"));
        playBtn.click();
        }

    }

