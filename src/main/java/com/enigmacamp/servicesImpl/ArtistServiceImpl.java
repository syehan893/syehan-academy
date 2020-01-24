package com.enigmacamp.servicesImpl;

import com.enigmacamp.entities.Artist;
import com.enigmacamp.repositories.ArtistRepository;
import com.enigmacamp.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Artist save(Artist artist){
        return artistRepository.save(artist);
    }

    @Override
    public Artist update(Integer id, Artist artist){
        return artistRepository.save(artist);
    }

    @Override
    public List<Artist> getAll(){
        return artistRepository.findAll();
    }

    @Override
    public Artist deleteById(Integer id){
        artistRepository.deleteById(id);
        return null;
    }

    @Override
    public Artist findById(Integer id){
        return artistRepository.getOne(id);
    }

    @Override
    public List<Artist> findArtistByGenreId(Integer id) {
        return artistRepository.findArtistByGenreId(id);
    }

}
