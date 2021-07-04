package inheritance;

import java.util.LinkedList;

public interface ResInterface  {

    String getName();
    String getCatego();

    double getStar();
    LinkedList<Review> getReviews();
    void addReview(Review review);
    void updateStar();

//    String toReviewString();
//    String toString();
}

