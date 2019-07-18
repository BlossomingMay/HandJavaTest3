package com.huang.exam1.service;

import com.huang.exam1.dao.FilmDao;
import com.huang.exam1.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    FilmDao filmDao;

    public int update(Film film) {
        return filmDao.add(film);
    }

}
