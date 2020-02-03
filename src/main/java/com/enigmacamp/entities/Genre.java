package com.enigmacamp.entities;

import com.sun.org.apache.xpath.internal.objects.XNull;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "genre")
public class Genre {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false , length = 150)
    private String name;

    @Column(nullable = false, length = 150)
    private String picture;

    @OneToMany(mappedBy = "genre")
    private  List<Artist> artists;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
