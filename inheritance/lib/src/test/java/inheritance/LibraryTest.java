/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

public class LibraryTest {


    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testToString() {
        Restaurant mac = new Restaurant("mac",3,"5.5");
        assertEquals("Restaurant{name='mac', stars=3, priceCatego=5.5$}",String.valueOf(mac));
    }
    @Test
    public void constructorRes() {
        Restaurant mac = new Restaurant("mac",3.0,"5.5");
        String expectedName = "mac";

        assertEquals("mac",mac.getName());
        assertEquals(4.0,mac.getStar(),4.0);
        assertEquals("5.5",mac.getCatego());

    }
    @Test
    public void TestAddReviewRes(){
        Restaurant mac = new Restaurant("mac",3.0,"5.5");
        Review RevTest = new Review("IT","Alex",4);
        mac.addReview(RevTest);
        assertTrue("retrun true if add review", mac.getReviews().size() == 1);

    }

    @Test
    public void testToStringRev() {
        Review RevTest = new Review("IT","Alex",4);
        assertEquals("Review{body='IT', author='Alex', stars=4}",String.valueOf(RevTest));
    }
    @Test
    public void constructorRev() {
        Review RevTest = new Review("IT","Alex",4);

        assertEquals("IT",RevTest.getBody());
        assertEquals("Alex",RevTest.getAuthor());
        assertEquals(4,RevTest.getStar(),1.2);

    }
    @Test
    public void testToStringShop() {
        Shop cityMall = new Shop("cityMall","good",5);
        assertEquals("Shop{name='cityMall', description='good', numOfDollar=5}",String.valueOf(cityMall));
    }
    @Test
    public void constructorShop() {
        Shop cityMall = new Shop("cityMall","good",5);

        assertEquals("cityMall",cityMall.getName());
        assertEquals("good",cityMall.getDes());
        assertEquals(5,cityMall.getNumDollar());

    }

    @Test
    public void testToStringTheater() {
        Theater movie = new Theater("Amara");
        assertEquals("Theater{name='Amara', movies=[], reviews={}}",String.valueOf(movie));
    }

    @Test
    public void constructorTheater() {
        Theater movie = new Theater("Amara");
        assertEquals("Amara",movie.getName());

    }

   @Test
    public void TestAddReview(){
        Theater testAdd = new Theater("test");
       testAdd.addNewRev("test","test",5);
       assertTrue("retrun true if add review", testAdd.getReviews().size() == 1);

   }

    @Test
    public void TestAddAndRemoveReview(){
        Theater testAdd = new Theater("test");
        testAdd.addMovie("test1");
        assertTrue("retrun true if add movie", testAdd.getMovies().size() == 1);
        testAdd.removeMovie("test1");
        assertTrue("retrun true if remove movie", testAdd.getMovies().size() == 0);

    }



}
