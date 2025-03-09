package de.ait.javalessons.controller;

import com.github.javafaker.Faker;
import de.ait.javalessons.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j // Аннотация Lombok для автоматического создания логгера
// @Slf4j - Lombok annotation for automatic logger creation
@RestController // Аннотация Spring, указывающая, что этот класс является REST-контроллером
// @RestController - Spring annotation indicating that this class is a REST controller
@RequestMapping("/movies") // Базовый путь для всех методов в этом контроллере
// @RequestMapping("/movies") - Base path for all methods in this controller
public class MovieController {

    private List<Movie> movies = new ArrayList<>(); // Список для хранения фильмов
    // private List<Movie> movies = new ArrayList<>(); - List to store movies

    Faker faker = new Faker(); // Генератор случайных данных
    // Faker faker = new Faker(); - Random data generator

    public MovieController() {
        // Инициализация списка фильмов при создании контроллера
        // Initializing the list of movies when the controller is created
        movies.addAll(List.of(new Movie(1, "Alien", "Sci-fi", 1979),
                new Movie(2, "The Thing", "Horror", 1982),
                new Movie(3, "Terminator", "Sci-fi", 1984),
                new Movie(4, "Mad Max", "Action", 1979)));
    }

    // Возвращает список всех фильмов.
    // Returns a list of all movies.
    @GetMapping
    public List<Movie> getMovies() {
        return movies;
    }

    // Возвращает конкретный фильм по его id. Если фильм не найден,
    // верните сообщение об ошибке или подходящий HTTP-статус (например, 404 Not Found).
    // Returns a specific movie by its id. If the movie is not found,
    // return an error message or an appropriate HTTP status (e.g., 404 Not Found).
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    // Добавляет новый фильм в список. Данные о фильме могут приходить в формате JSON.
    // Верните в ответе информацию о добавленном фильме или статус 201 Created.
    // Adds a new movie to the list. Movie data can come in JSON format.
    // Return information about the added movie or status 201 Created in the response.
    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        movies.add(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }

    // Удаляет фильм из списка по id.
    // Deletes a movie from the list by id.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id) {
        boolean result = movies.removeIf(movie -> movie.getId() == id);
        if(result) {
            return ResponseEntity.ok("Movie with id " + id + " was deleted");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie with id " + id + " was not found");
        }
    }
}