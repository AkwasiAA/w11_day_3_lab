import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Back End", "Juan", "JN 569841D", 80000);
    }

    @Test
    public void managerHasName(){
        assertEquals("Juan", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("JN 569841D", manager.getNiNumber());
    }

    @Test
    public void canGetRaisedSalary(){
        manager.raiseSalary(500);
        assertEquals(80500, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(800, manager.payBonus(), 0.01);
    }



}
