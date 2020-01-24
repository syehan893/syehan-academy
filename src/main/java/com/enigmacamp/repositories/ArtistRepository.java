package com.enigmacamp.repositories;

import com.enigmacamp.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist,Integer> {
    public List<Artist> findArtistByGenreId(Integer id);
}
