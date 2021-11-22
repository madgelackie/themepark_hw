import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.allReviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(1);
        visitor.addAttractionToVisitedList(attraction);
    }
}
