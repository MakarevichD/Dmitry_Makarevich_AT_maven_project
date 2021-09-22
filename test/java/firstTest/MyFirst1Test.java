package firstTest;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirst1Test {

    @Ignore("don't run")
    @Test
    public void MyTest1 (){

        assertEquals("i",2,3);


    }
    @Test
    public void MyTest2(){

        assertEquals("s",10,10);

    }

}
