
package main;

import moviestore.Category;
import moviestore.Client;
import moviestore.Movie;
import moviestore.MovieStore;
import moviestore.RentedMovie;
import java.util.ArrayList;
import java.time.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        MovieStore blockbuster= new MovieStore();
        Category newHits= new Category("New Hits", 9.99, 1);
        Category classics= new Category("Classics", 5.99, 1);
        Category weekly= new Category("Weekly", 6.99, 7);
        Category special= new Category("Special", 15.99, 1);
        
        LocalDate d1= LocalDate.of(2009, Month.MAY, 20);
        blockbuster.addMovie("Inglorious Basterds", "DVD", d1, special);
        
        LocalDate d2= LocalDate.of(1999, Month.MARCH, 31);
        blockbuster.addMovie("The Matrix", "DVD", d2, classics);
        
        LocalDate d3= LocalDate.of(2018, Month.JANUARY, 29);
        blockbuster.addMovie("Black Panther", "DVD", d3, newHits);
        
        LocalDate d4= LocalDate.of(2016, Month.DECEMBER, 10);
        blockbuster.addMovie("Rogue One", "DVD", d4, weekly);
        
        blockbuster.addClient("Pablo", 19);
        blockbuster.addClient("Juan", 19);
        blockbuster.addClient("Andres", 20);
        blockbuster.addClient("William", 18);
        
        blockbuster.searchClient("Pablo").addRentedMovie(blockbuster.searchMovie("The Matrix"), 5);
        blockbuster.searchClient("Pablo").addRentedMovie(blockbuster.searchMovie("Rogue One"), 2);
        blockbuster.searchClient("Pablo").addRentedMovie(blockbuster.searchMovie("The Matrix"), 6);
        System.out.println("Pablo pays: " + blockbuster.searchClient("Pablo").pay() + "$");
        
        blockbuster.searchClient("Juan").addRentedMovie(blockbuster.searchMovie("The Matrix"), 1);
        blockbuster.searchClient("Juan").addRentedMovie(blockbuster.searchMovie("Rogue One"), 7);
        System.out.println("Juan pays: " + blockbuster.searchClient("Juan").pay() + "$");
        
        blockbuster.searchClient("Andres").addRentedMovie(blockbuster.searchMovie("Inglorious Basterds"), 15);
        System.out.println("Andres pays: " + blockbuster.searchClient("Andres").pay() + "$");
        
        blockbuster.searchClient("William").addRentedMovie(blockbuster.searchMovie("Black Panther"), 20);
        System.out.println("William pays: " + blockbuster.searchClient("William").pay() + "$");
        
        System.out.println("The most rented category was: " + blockbuster.searchMostRentedCat());
    }
}
