import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.Stall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Visitor visitor;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;

    @Before
    public void setUp() {
        themePark = new ThemePark();
        visitor = new Visitor(30, 190, 60);
        rollerCoaster = new RollerCoaster("Speed Demon", 4);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 4);
    }

    @Test
    public void hasAllAttractionsAndStalls(){
        themePark.addToAllReviewed(candyflossStall);
        assertEquals(1, themePark.getAllReviewed().size());
    }
    @Test
    public void canIncrementVisitCount(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAddToVisitorsVisitedAttractionLIst(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}


