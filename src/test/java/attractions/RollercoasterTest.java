package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(16, 150, 30);
        visitor2 = new Visitor(11, 150, 25);
        visitor3 = new Visitor(11, 130, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canVisit(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cantVisitFailsOneCondition(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cantVisitFailsBothConditions(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
}
