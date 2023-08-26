import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MovieRepository {
    private Map<String, Movie> movies = new HashMap<>();
    private Map<String, Director> directors = new HashMap<>();

    public void addMovie(Movie movie) {
        movies.put(movie.getName(), movie);
    }

    public void addDirector(Director director) {
        directors.put(director.getName(), director);
    }

    public Movie getMovieByName(String name) {
        return movies.get(name);
    }

    public Director getDirectorByName(String name) {
        return directors.get(name);
    }

    public void pairMovieAndDirector(String movieName, String directorName) {
        Movie movie = movies.get(movieName);
        Director director = directors.get(directorName);
        if (movie != null && director != null) {
            // Perform the pairing logic here if needed
        }
    }

    // Implement other methods as needed
}
