package day12;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> musicArtist1 = new ArrayList<>();
        musicArtist1.add("Ivan Ivanov");
        musicArtist1.add("Petr Petrov");
        musicArtist1.add("Oleg Sidorov");

        MusicBand2 band1 = new MusicBand2("Muse", 1995, musicArtist1);

        List<String> musicArtist2 = new ArrayList<>();
        musicArtist2.add("Jhon Silver");
        musicArtist2.add("Jack Wolfskin");

        MusicBand2 band2 = new MusicBand2("Dragons", 2005, musicArtist2);

        List<MusicBand2> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        System.out.println(musicBands);

        MusicBand2.mergeMusicBand(band1, band2);
        System.out.println(musicBands);
    }
}