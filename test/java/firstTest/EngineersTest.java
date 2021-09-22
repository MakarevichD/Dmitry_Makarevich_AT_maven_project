import People.AutoEngineer;
import People.Engineer;
import People.ManualEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)


public class EngineersTest {

    private Engineer en;
    private int expSkill;

    public EngineersTest(Engineer en, int expSkill) {
        this.en = en;
        this.expSkill = expSkill;

    }
    @Parameterized.Parameters
    public static Collection<Object[]> parameters(){
        return Arrays.asList(
                new Object[][] {
                        {new AutoEngineer(),3},
                        {new ManualEngineer(),2}
                }
        );
    }
    @Test
    public void checkSkillManual (){
        assertEquals (expSkill,en.getSkill());
    }












}
