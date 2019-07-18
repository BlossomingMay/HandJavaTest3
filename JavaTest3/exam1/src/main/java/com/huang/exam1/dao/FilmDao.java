package com.huang.exam1.dao;


import com.huang.exam1.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class FilmDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Film film) {
        return jdbcTemplate.update("insert into film(film_id,title,description) values(?,?,?)",
                film.getFilm_id(),film.getTitle(),film.getDescription());

    }



}
