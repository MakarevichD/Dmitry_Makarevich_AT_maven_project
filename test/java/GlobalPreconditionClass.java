import org.openqa.selenium.WebDriver;

public class GlobalPreconditionClass {


    static {
        doBeforeAll();
        doAfterAll();
    }

    private static void doBeforeAll() {

    }

    private static void doAfterAll(){

        Runtime.getRuntime().addShutdownHook(new Thread(()->{

        }));
    }

    }

