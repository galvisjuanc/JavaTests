package com.jcgc.movies.data;

import com.jcgc.movies.model.Genre;
import com.jcgc.movies.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

class MovieRepositoryImplTest {

    private MovieRepositoryImpl movieRepositoryImpl;

    @BeforeEach
    public void setUp() throws Exception {

        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","sa", "sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepositoryImpl = new MovieRepositoryImpl(jdbcTemplate);
    }

    @Test
    void findById() {
        Movie movie = movieRepositoryImpl.findById(2);
        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    void findAll() throws SQLException {

        Collection<Movie> movies = movieRepositoryImpl.findAll();

        assertThat(movies, is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void insert_a_movie() {
        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);
        movieRepositoryImpl.saveOrUpdate(movie);

        Movie movieFromDb = movieRepositoryImpl.findById(4);
        assertThat( movieFromDb, is(new Movie(4, "Super 8", 112, Genre.THRILLER)));
    }
}