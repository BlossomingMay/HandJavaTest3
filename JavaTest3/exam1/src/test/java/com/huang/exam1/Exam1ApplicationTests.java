package com.huang.exam1;

import com.huang.exam1.dao.FilmDao;
import com.huang.exam1.entities.Film;
import com.huang.exam1.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exam1ApplicationTests {

    @Test
    public void contextLoads() {
//        FilmService filmService =  new FilmService();
        Film film = new Film();
//        filmService.update(film);
        FilmDao filmDao = new FilmDao();
        filmDao.add(film);
    }

}
