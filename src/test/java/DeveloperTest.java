import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Craig", "JP 562248B", 60000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Craig", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("JP 562248B", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(60000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetRaisedSalary(){
        developer.raiseSalary(500);
        assertEquals(60500, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(600, developer.payBonus(), 0.01);
    }


}
