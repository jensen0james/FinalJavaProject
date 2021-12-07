package music;

import java.util.ArrayDeque;

public class Album {
    String title;
    String coverArt;
    ArrayDeque<Artist> credits;
    ArrayDeque<Track> tracks;  
    double price;
    Genre[] genres;

    public Album(String title, String coverArt, ArrayDeque<Artist> credits, ArrayDeque<Track> tracks, double price, Genre[] genres) {
        this.title = title;
        this.coverArt = coverArt;
        this.credits = credits;
        this.tracks = tracks;
        this.price = price;
        this.genres = genres;
    }

        
}
