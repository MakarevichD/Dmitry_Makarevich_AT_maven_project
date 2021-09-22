import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class ClockTest {

    public static void main(String[] args) throws MalformedURLException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Pixel 3");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.MelsoftGames.FamilyIslandFarm");
        caps.setCapability("appActivity", "com.dynamo.android.DefoldActivity");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement> (new URL("http://0.0.0.0:4723/wd/hub"), caps);

    }
}

