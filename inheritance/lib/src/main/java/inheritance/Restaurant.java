package inheritance;

import java.io.Serializable;
import java.util.*;

public class Restaurant implements ResInterface{

    private String name;
    private double stars;
    private String priceCatego;
    private List<Review> review = new ArrayList<>();

    public Restaurant(String name,double stars, String priceCatego) {
        this.name = name;
        this.priceCatego = priceCatego;
        if (stars > 0 && stars <=5) {
            this.stars = stars;
        } else {
            System.out.println("choose between 0-5");;
        }
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getStar() {
        return this.stars;
    }

    @Override
    public ArrayList<Review> getReviews() {
        return (ArrayList<Review>) review;
    }

//    public List<Review> getReview() {
//        return review;
//    }

    @Override
    public void addReview(Review review) {
        this.review.add(review);
        updateStar();
    }


    @Override
    public void updateStar() {
        double avg = 0.0;
        for (int i=0; i < getReviews().size(); i++) {
            avg += getReviews().get(i).getStar();
        }
        avg = avg/(getReviews().size());
        avg = Math.round(avg);
        this.stars = avg;
    }


    @Override
    public String getCatego() {
        return this.priceCatego;
    }





//    @Override
//    public String toString() {
//        return String.format(
//                "%s has a rating of %.1f stars and is a %s price point",
//                getName(), getStar(), getCatego());
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCatego=" + priceCatego +
                "$"+
                '}';
    }


//    @Override
//    public String toString() {
//        return String.format(
//                "%s has a rating of %.1f stars and is a %s price point",
//                getName(), getStar(), getCatego());
//    }
}
