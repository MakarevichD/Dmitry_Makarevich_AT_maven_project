import driver.Config;
import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DemoDriveTest2 {

    private WebDriver webDriver;

    @Before
    public void initDriver() {
        webDriver = Driver.getDriver(Config.CHROME);
    }

    @After
    public void closeDriver() {
        Driver.destroy();
    }

    @Test
    public void firstTest() {
        webDriver.get("https://pikabu.ru");
        System.out.println(webDriver.getTitle());

        }

    @Test
    public void secondTest() {

        webDriver.get("https://pikabu.ru");
        System.out.println(webDriver.getTitle());


    }


}
