package org.example;

public class SearchSong {
    private String songName;
    private String genre;
    private String albumsArtist;
    private double duration;

    public String getSongName() {
        return songName;
    }
    public String getGenre(){
        return genre;
    }
    public String getAlbumsArtist(){
        return albumsArtist;
    }
    public double getDuration() {
        return duration;
    }
    public SearchSong(String songName,String genre,String albumsArtist,double duration){

    }
}
