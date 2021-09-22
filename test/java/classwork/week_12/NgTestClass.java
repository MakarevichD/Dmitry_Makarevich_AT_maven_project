package classwork.week_12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(NGListener.class)
public class NgTestClass {

    private static final Logger LOGGER = LogManager.getLogger(NgTestClass.class);

    @Test(description = "94311")
    public void FirstTest() {

        LOGGER.info("Executing first test");
        Assert.assertTrue(true);

    }

    @Test(description = "94312")
    public void SecondTest() {

        LOGGER.info("Executing second test");
        Assert.fail();

    }


}
