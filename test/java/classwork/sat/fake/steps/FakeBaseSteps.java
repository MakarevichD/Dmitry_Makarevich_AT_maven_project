package classwork.sat.fake.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import driver.Config;
import driver.Driver;

import java.net.MalformedURLException;


public class FakeBaseSteps {

    private static final Logger LOGGER =

            LogManager.getLogger(FakeBaseSteps.class);


    @Before
    public void beforeTest() throws MalformedURLException {

        LOGGER.info("initialize webdriver");
        //Driver.getDriver();
        Driver.initDriver(Config.REMOTE);

    }

    @After
    public void afterTest (){


    }

}
