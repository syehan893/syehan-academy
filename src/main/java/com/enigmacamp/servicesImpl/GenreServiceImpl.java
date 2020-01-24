package com.enigmacamp.servicesImpl;

import com.enigmacamp.entities.Genre;
import com.enigmacamp.repositories.GenreRepository;
import com.enigmacamp.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GenreServiceImpl implements GenreService {

    @Autowired
    GenreRepository genreRepo;

    @Override
    public Genre save(Genre genre){
        return genreRepo.save(genre);
    }

    @Override
    public Genre update(Integer id, Genre genre){
        return genreRepo.save(genre);
    }

    @Override
    public List<Genre> getAll(){
        return genreRepo.findAll();
    }

    @Override
    public Genre deleteById(Integer id){
        genreRepo.deleteById(id);
        return null;
    }

    @Override
    public Genre findById(Integer id){
    return genreRepo.getOne(id);
    }

}
