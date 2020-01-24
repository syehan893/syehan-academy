package com.enigmacamp.controller;

import com.enigmacamp.entities.Artist;
import com.enigmacamp.servicesImpl.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    ArtistServiceImpl artistService;

    @GetMapping()
    List<Artist> findAll(){
        return artistService.getAll();
    }

    @PostMapping("/")
    Artist save (@RequestBody Artist artist){
        return artistService.save(artist);
    }

    @PutMapping("/{id}")
    Artist update (@RequestBody Artist artist, @PathVariable Integer id){
        return artistService.update(id,artist);
    }

    @DeleteMapping("/{id}")
    Artist delete (@PathVariable Integer id){
        return artistService.deleteById(id);
    }

    @GetMapping("/{id}")
    Artist findById (@PathVariable Integer id){
        return artistService.findById(id);
    }

    @GetMapping("/genre/{id}")
    List<Artist> findArtistByGenreId(@PathVariable Integer id){return artistService.findArtistByGenreId(id);}

}
