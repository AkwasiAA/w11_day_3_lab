import Staff.TechStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sam", "JA 589561K", 50000);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Sam", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals("JA 589561K", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(50000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetRaisedSalary(){
        databaseAdmin.raiseSalary(500);
        assertEquals(50500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, databaseAdmin.payBonus(), 0.01);
    }
}
