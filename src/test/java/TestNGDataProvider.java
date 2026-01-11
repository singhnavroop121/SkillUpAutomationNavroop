import org.testng.annotations.DataProvider;

public class TestNGDataProvider extends BaseTest {

    @DataProvider(name="NegativeLoginTestData")
    public Object[][] getDataFromDataPRovider() {
        return new Object[][]{
                {"invalid@koel.dev","Intern$hip001"},
                {"student@skillup.study","invalidPassword"},
                {"",""}


};
    }

}