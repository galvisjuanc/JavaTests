package com.jcgc.movies.data;

import com.jcgc.movies.model.Genre;
import com.jcgc.movies.model.Movie;
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

    @Test
    void findById() {
    }

    @Test
    void findAll() throws SQLException {

        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepositoryImpl movieRepositoryImpl = new MovieRepositoryImpl(jdbcTemplate);
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
}