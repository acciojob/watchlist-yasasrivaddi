import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public ResponseEntity<String> addMovie(Movie movie) {
        movieRepository.addMovie(movie);
        return ResponseEntity.ok("Movie added successfully");
    }

    public ResponseEntity<String> addDirector(Director director) {
        movieRepository.addDirector(director);
        return ResponseEntity.ok("Director added successfully");
    }

    public ResponseEntity<String> addMovieDirectorPair(String movieName, String directorName) {
        movieRepository.pairMovieAndDirector(movieName, directorName);
        return ResponseEntity.ok("Movie-Director pair added successfully");
    }

    public ResponseEntity<Movie> getMovieByName(String name) {
        Movie movie = movieRepository.getMovieByName(name);
        return ResponseEntity.ok(movie);
    }

    public ResponseEntity<Director> getDirectorByName(String name) {
        Director director = movieRepository.getDirectorByName(name);
        return ResponseEntity.ok(director);
    }

    public ResponseEntity<List<String>> getMoviesByDirectorName(String directorName) {
        // Implement this method as needed
    }

    public ResponseEntity<List<String>> findAllMovies() {
        // Implement this method as needed
    }

    public ResponseEntity<String> deleteDirectorByName(String directorName) {
        // Implement this method as needed
    }

    public ResponseEntity<String> deleteAllDirectors() {
        // Implement this method as needed
    }
}
