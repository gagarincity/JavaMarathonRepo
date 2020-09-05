package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<MusicArtist> musicArtist1 = new ArrayList<>();
        musicArtist1.add(new MusicArtist("Ivan Ivanov", 25));
        musicArtist1.add(new MusicArtist("Petr Petrov", 20));
        musicArtist1.add(new MusicArtist("Jack Wolfskin", 35));
        musicArtist1.add(new MusicArtist("Jack Wolfskin", 35));

        MusicBand3 band1 = new MusicBand3("Imagine", 1995, musicArtist1);

        ArrayList<MusicArtist> musicArtist2 = new ArrayList<>();
        musicArtist2.add(new MusicArtist("Jhon Silver", 18));
        musicArtist2.add(new MusicArtist("Jack Sparrow", 60));
        musicArtist2.add(new MusicArtist("Jack Sparrow", 60));

        MusicBand3 band2 = new MusicBand3("Dragons", 2005, musicArtist2);

        List<MusicBand3> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        System.out.println(musicBands);

        MusicBand3.mergeMusicBand(band1, band2);
        System.out.println(musicBands);
    }
}
