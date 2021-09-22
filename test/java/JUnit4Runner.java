import firstTest.MyFirst1Test;
import firstTest.MyFirstTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MyFirstTest.class,
        MyFirst1Test.class})

public class JUnit4Runner {




}
