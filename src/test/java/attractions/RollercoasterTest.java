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
    Visitor visitor4;
    Visitor visitor5;
    Visitor visitor6;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(16, 150, 30);
        visitor2 = new Visitor(11, 150, 25);
        visitor3 = new Visitor(11, 130, 50);
        visitor4 = new Visitor(18, 201, 50);
        visitor5 = new Visitor(18, 200, 50);
        visitor6 = new Visitor(18, 199, 50);
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

    @Test
    public void hasPriceForOver200cm(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.001);
    }

    @Test
    public void hasPriceFor200cm(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor5), 0.001);
    }

    @Test
    public void hasPriceForUnder200cm(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor6), 0.001);
    }
}
