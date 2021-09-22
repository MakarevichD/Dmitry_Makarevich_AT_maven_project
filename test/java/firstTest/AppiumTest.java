import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;



public class AppiumTest {

    @Test
    public void TestNew() throws MalformedURLException {



        DesiredCapabilities capabilities = new DesiredCapabilities();

        File apkInstall = new File("Users/d.makarevich/Downloads/FI_autotest");
        capabilities.setCapability("deviceName", "Emulator");
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("app","apkInstall");
        capabilities.setCapability("appPackage", "com.MelsoftGames.FamilyIslandFarm");
        capabilities.setCapability("appActivity", "com.dynamo.android.DefoldActivity");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>
                (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);


    }
}
