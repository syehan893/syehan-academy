package com.enigmacamp.servicesImpl;

import com.enigmacamp.entities.Song;
import com.enigmacamp.repositories.SongRepository;
import com.enigmacamp.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public Song save(Song song){
        return songRepository.save(song);
    }

    @Override
    public Song update(Integer id, Song song){
        return songRepository.save(song);
    }

    @Override
    public List<Song> getAll(){
        return songRepository.findAll();
    }

    @Override
    public Song deleteById(Integer id){
        songRepository.deleteById(id);
        return null;
    }

    @Override
    public Song findById(Integer id){
        return songRepository.getOne(id);
    }

    @Override
    public List<Song> findSongByArtistId(Integer id) {
        return songRepository.findSongByArtistId(id);
    }
}
