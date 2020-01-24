package com.enigmacamp.donfig;

import com.enigmacamp.servicesImpl.ArtistServiceImpl;
import com.enigmacamp.servicesImpl.GenreServiceImpl;
import com.enigmacamp.servicesImpl.SongServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoSpringConfig {

    @Bean
    public ArtistServiceImpl artistService(){
        return new ArtistServiceImpl();
    }

    @Bean
    public SongServiceImpl songService(){
        return new SongServiceImpl();
    }

    @Bean
    public GenreServiceImpl genreService(){
        return new GenreServiceImpl();
    }

}
