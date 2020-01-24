package com.enigmacamp.services;

import com.enigmacamp.entities.Artist;

import java.util.List;

public interface ArtistService {
    Artist save(Artist artist);

    Artist update(Integer id, Artist artist);

    List<Artist> getAll();

    Artist deleteById(Integer id);

    Artist findById(Integer id);

    List<Artist> findArtistByGenreId(Integer id);
}
