/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Restaurant mac = new Restaurant("mac",3,"5.5");
        System.out.println(mac);

        Review RevTest = new Review("IT","Alex",3.5);
        Review RevTest1 = new Review("IT","Alex",4.0);
        mac.addReview(RevTest);
        mac.addReview(RevTest1);
        System.out.println(mac.getReviews());
        System.out.println(mac);
        System.out.println(RevTest);

        Shop cityMall = new Shop("cityMall","good",5);
        System.out.println(cityMall);
            Review ShopTest = new Review("good","sa3ed",3);
            Review ShopTest1 = new Review(" verygood","mas3ood",7);
            cityMall.addReview(ShopTest);
            cityMall.addReview(ShopTest1);
                 System.out.println(cityMall);

        Theater movie = new Theater("Amara");
//        Theater movie2 = new Theater("toto");
        movie.addMovie("toto");
        movie.addMovie("bobo");
        System.out.println(movie.getMovies());
        System.out.println(movie);

        System.out.println(movie.getMovies());
        movie.addNewRev("good","habeeb",4);

//        review
        Review inqury = new Review("good","ahmad", 3);
        movie.addNewRev(inqury,"toto");
        movie.removeMovie("bobo");
        movie.addNewRev(inqury,"bobo");
        System.out.println(movie);
        System.out.println(movie.getReviews());
    }

}