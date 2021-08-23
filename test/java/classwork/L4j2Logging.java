package classwork;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class L4j2Logging {

    private static final Logger LOGGER =
            LogManager.getLogger(L4jLogging.class.getName());

    public static void main(String[] args) {

        LOGGER.fatal("Fatal message");
        LOGGER.error("Error message");
        LOGGER.warn("Warn message");
        LOGGER.info("Info message");
        LOGGER.debug("Debug message");
        LOGGER.trace("Trace message");
    }
}
