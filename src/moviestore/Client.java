
package moviestore;

import java.util.ArrayList;

public class Client {
    
    private ArrayList<RentedMovie> rentedMovies;
    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        rentedMovies= new ArrayList();
    }

    public ArrayList<RentedMovie> getRentedMovies() {
        return rentedMovies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRentedMovies(ArrayList<RentedMovie> rentedMovies) {
        this.rentedMovies = rentedMovies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void addRentedMovie(Movie movie, int daysRented){
        if(daysRented>movie.getCategory().getMinRent()){
            RentedMovie newMovie= new RentedMovie(movie,daysRented);
            rentedMovies.add(newMovie);
        } else{
            daysRented=movie.getCategory().getMinRent();
            RentedMovie newMovie= new RentedMovie(movie,daysRented);
            rentedMovies.add(newMovie);
        }
    }
    
    public double pay(){
        double payment=0;
        for(RentedMovie rentedMovie: rentedMovies){
            payment+=(rentedMovie.getMovie().getCategory().getPrice())*(rentedMovie.getDaysRented());
        }
        return payment;
    }
    
}
