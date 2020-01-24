package com.enigmacamp.services;

import com.enigmacamp.entities.Song;

import java.util.List;

public interface SongService {
    Song save(Song song);

    Song update(Integer id, Song song);

    List<Song> getAll();

    Song deleteById(Integer id);

    Song findById(Integer id);

    List<Song> findSongByArtistId(Integer id);
}
