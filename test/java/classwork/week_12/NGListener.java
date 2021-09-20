package classwork.week_12;

import classwork.L4jLogging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGListener implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(ITestListener.class);
    private String runId = "954";


    @Override
    public void onTestStart(ITestResult result) {

        LOGGER.info("Printing getName" + result.getName());
        LOGGER.info("Printing getTestName" + result.getTestName());
        LOGGER.info("Printing getMethod().getDescription" + result.getMethod().getDescription());
        result.getMethod().getDescription();

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        LOGGER.info("Printing onSuccess" + result.getStatus());
        TestRailReporter.reportResult(runId, result.getMethod().getDescription(), new Result(1));

    }

    @Override
    public void onTestFailure(ITestResult result) {

        LOGGER.info("Printing onSuccess" + result.getStatus());
        TestRailReporter.reportResult(runId, result.getMethod().getDescription(),new Result(5));

    }




}
