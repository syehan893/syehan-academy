package com.enigmacamp.repositories;

import com.enigmacamp.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song,Integer> {
    public List<Song> findSongByArtistId(Integer id);
}
