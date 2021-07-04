package inheritance;

import java.util.LinkedList;

public class Review implements RevInterface {
    private String body;
    private String author;
    private double stars;

    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }



    @Override
    public double getStar() {
        return this.stars;
    }




    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }


    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
