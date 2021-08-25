import Staff.Management.Director;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Executive Board", "Lily", "JX 415236L", 100000, 1500000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Lily", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("JX 415236L", director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(1500000, director.getBudget(), 0.01);
    }

    @Test
    public void canGetRaisedSalary(){
        director.raiseSalary(500);
        assertEquals(100500, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2000, director.payBonus(), 0.01);
    }
}

