package music;

public class Track {
    
    public static final int MAX_GENRES = 3;
    
    String name;
    int seconds;
    double price;
    Genre[] genres;

    public Track(String name, int seconds, double price, Genre[] genres) {
        this.name = name;
        this.seconds = seconds;
        this.price = price;
        this.genres = genres;
    }
}
