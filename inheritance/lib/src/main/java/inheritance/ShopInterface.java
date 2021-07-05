package inheritance;

import java.util.LinkedList;

public interface ShopInterface {
    String getName();
    String getDes();
    int getNumDollar();

    LinkedList<Review> getReviews();
    void addReview(Review review);
    void updateStar();

}
