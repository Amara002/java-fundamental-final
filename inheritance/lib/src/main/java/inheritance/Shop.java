package inheritance;

import java.util.LinkedList;

public class Shop  implements ShopInterface{
    private String name;
    private String description;
    private int numOfDollar;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, String description, int numOfDollar) {
        this.name = name;
        this.description = description;
        this.numOfDollar = numOfDollar;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDes() {
        return  this.description;
    }

    @Override
    public int getNumDollar() {
        return this.numOfDollar;
    }

    @Override
    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStar();
    }

    @Override
    public void updateStar() {
        int avg = 0;
        for (int i=0; i < getReviews().size(); i++) {
            avg += getReviews().get(i).getStar();
        }
        avg = avg/(getReviews().size());
        avg = Math.round(avg);
        this.numOfDollar = avg;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollar=" + numOfDollar +
                '}';
    }
}
