import java.util.*;

class Movie {
    private String title;
    private String showtime;

    public Movie(String title, String showtime) {
        this.title = title;
        this.showtime = showtime;
    }

    public String getTitle() {
        return title;
    }

    public String getShowtime() {
        return showtime;
    }
}

public class movieScheduleManager {
    private List<Movie> movies;

    public movieScheduleManager() {
        movies = new ArrayList<>();
    }

    public void addMovie(String title, String time) {
        movies.add(new Movie(title, time));
        System.out.println("Added: " + title + " at " + time);
    }

    public void searchMovie(String keyword) {
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + movie.getTitle() + " at " + movie.getShowtime());
            }else{
                System.out.println("No Movies found!!");
            }
        }
        
    }

    public void viewAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        System.out.println("Current Movie Schedule:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " - " + movie.getShowtime());
        }
    }

    public static void main(String[] args) {
        movieScheduleManager manager = new movieScheduleManager();
        
        manager.addMovie("The Matrix", "14:30");
        manager.addMovie("Inception", "18:00");
        manager.addMovie("The Dark Knight", "20:30");
        
        manager.viewAllMovies();
        manager.searchMovie("matrix");
    }
}