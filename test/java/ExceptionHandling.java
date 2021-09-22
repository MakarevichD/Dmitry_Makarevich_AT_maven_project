import org.junit.Test;

import java.util.ArrayList;

public class ExceptionHandling {


    @Test(expected = IndexOutOfBoundsException.class)
    public void empty (){
        new ArrayList<Object>().get(0);
    }
}
