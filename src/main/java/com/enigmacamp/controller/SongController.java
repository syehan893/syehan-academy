package com.enigmacamp.controller;

import com.enigmacamp.entities.Song;
import com.enigmacamp.servicesImpl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/song")
public class SongController {

    @Autowired
    SongServiceImpl songService;

    @GetMapping()
    List<Song> findAll(){
        return songService.getAll();
    }

    @PostMapping("/")
    Song save (@RequestBody Song song){
        return songService.save(song);
    }

    @PutMapping("/{id}")
    Song update (@RequestBody Song song, @PathVariable Integer id){
        return songService.update(id,song);
    }

    @DeleteMapping("/{id}")
    Song delete (@PathVariable Integer id){
        return songService.deleteById(id);
    }

    @GetMapping("/{id}")
    Song findById (@PathVariable Integer id){
        return songService.findById(id);
    }

    @GetMapping("/artist/{id}")
    List<Song> findSongByArtistId (@PathVariable Integer id){return songService.findSongByArtistId(id);}

}
