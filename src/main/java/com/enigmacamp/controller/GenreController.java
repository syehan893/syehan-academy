package com.enigmacamp.controller;

import com.enigmacamp.entities.Genre;
import com.enigmacamp.servicesImpl.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/genre")
public class GenreController {

    @Autowired
    GenreServiceImpl genreService;

    @GetMapping()
    List<Genre> findAll(){
        return genreService.getAll();
    }

    @PostMapping("/")
    Genre save (@RequestBody Genre genre){
        return genreService.save(genre);
    }

    @PutMapping("/{id}")
    Genre update (@RequestBody Genre genre, @PathVariable Integer id){
        return genreService.update(id,genre);
    }

    @DeleteMapping("/{id}")
    Genre delete (@PathVariable Integer id){
        return genreService.deleteById(id);
    }

    @GetMapping("/{id}")
    Genre findById (@PathVariable Integer id){
        return genreService.findById(id);
    }

}
