package ru.pranch.dao;

import ru.pranch.model.Film;

import java.util.List;

public interface FilmDAO {
    List<Film> allFilms(int page);

    void add(Film film);

    void delete(Film film);

    void edit(Film film);

    Film getById(int id);

    int filmCount();

    boolean checkTitle(String title);
}