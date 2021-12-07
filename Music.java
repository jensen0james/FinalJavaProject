package music;

import java.util.Arrays;
import java.util.Scanner;

public class Music {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        getTrackData();
    }

    public static void getTrackData() {
        String name;
        Genre[] genres = new Genre[Track.MAX_GENRES];
        int seconds;
        double price;
        System.out.print("Name: ");
        name = keyboard.nextLine();
        System.out.println("Gernres: ");
        String genre = keyboard.nextLine().trim();
        int i = 0;
        while (!genre.isBlank() && i < Track.MAX_GENRES) {
            genres[i] = new Genre(genre);
            genre = keyboard.nextLine().trim();
            i++;
        }
        System.out.println(Arrays.toString(genres));
    }
}
