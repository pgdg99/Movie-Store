
package moviestore;

import java.util.ArrayList;
import java.time.*;
import java.util.*;

public class MovieStore {
    
    private ArrayList<Movie> movies;
    private ArrayList<Client> clients;

    public MovieStore() {
        movies= new ArrayList();
        clients= new ArrayList();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    
    public void addMovie(String n, String f, LocalDate d, Category c){
        Movie newMovie= new Movie(n,f,d,c);
        movies.add(newMovie);
    }
    
    public void addClient(String n, int a){
        Client newClient= new Client(n,a);
        clients.add(newClient);
    }
    
    public Movie searchMovie(String name){
        for (Movie movie: movies){
            if(movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }
    
    public Client searchClient(String name){
        for (Client client: clients){
            if(client.getName().equals(name)){
                return client;
            }
        }
        return null;
    }
    
    public String searchMostRentedCat(){
        ArrayList<String> list= new ArrayList();
        for(Client client: clients){
            for(RentedMovie rentedMovie: client.getRentedMovies()){
                list.add(rentedMovie.getMovie().getCategory().getName());
            }
        }
        Set<String> count= new HashSet<>(list);
        int max=0;
        String category=null;
        for(String number: count){
            if(max<Collections.frequency(list, number)){
                max=Collections.frequency(list, number);
                category=number;
            }
        }
        return category;
    }
}
