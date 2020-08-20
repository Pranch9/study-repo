package ru.pranch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pranch.dao.FilmDAO;
import ru.pranch.model.Film;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO;

    @Autowired
    public void setFilmDAO(FilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    @Transactional
    @Override
    public List<Film> allFilms(int page) {
        return filmDAO.allFilms(page);
    }

    @Transactional
    @Override
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Transactional
    @Override
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Transactional
    @Override
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Transactional
    @Override
    public Film getById(int id) {
        return filmDAO.getById(id);
    }

    @Transactional
    @Override
    public int filmsCount() {
        return filmDAO.filmCount();
    }

    @Transactional
    @Override
    public boolean checkTitle(String title) {
        return filmDAO.checkTitle(title);
    }
}
