package com.enigmacamp.services;

import com.enigmacamp.entities.Genre;

import java.util.List;

public interface GenreService {
    Genre save(Genre genre);

    Genre update(Integer id, Genre genre);

    List<Genre> getAll();

    Genre deleteById(Integer id);

    Genre findById(Integer id);
}
