
package moviestore;


public class RentedMovie {
    
    private Movie movie;
    private int daysRented;

    public RentedMovie(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    
    
}
