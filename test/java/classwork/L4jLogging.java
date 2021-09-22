package classwork;

import org.apache.log4j.Logger;

public class L4jLogging {
    private static final Logger LOGGER =
            Logger.getLogger(L4jLogging.class.getName());

    public static void main(String[] args) {

        LOGGER.fatal("Fatal message");
        LOGGER.error("Error message");
        LOGGER.warn("Warn message");
        LOGGER.info("Info message");
        LOGGER.debug("Debug message");
        LOGGER.trace("Trace message");
    }
}
