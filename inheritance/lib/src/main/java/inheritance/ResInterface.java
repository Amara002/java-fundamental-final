package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public interface ResInterface  {

    String getName();
    String getCatego();

    double getStar();
    ArrayList<Review> getReviews();
    void addReview(Review review);
    void updateStar();

//    String toReviewString();
//    String toString();
}

