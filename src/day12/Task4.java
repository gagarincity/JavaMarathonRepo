package day12;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> musicArtist1 = new ArrayList<>();
        ArrayList<String> musicArtist2 = new ArrayList<>();

        musicArtist1.add("Ivan Ivanov");
        musicArtist1.add("Petr Petrov");
        musicArtist1.add("Oleg Sidorov");
        musicArtist2.add("Jhon Silver");
        musicArtist2.add("Jack Wolfskin");

        MusicBand2 mbA = new MusicBand2("Muse", 1995, musicArtist1);
        MusicBand2 mbB = new MusicBand2("Dragons", 2005, musicArtist2);

        List<MusicBand2> musicBands = new ArrayList<>();
        musicBands.add(mbA);
        musicBands.add(mbB);
        System.out.println(musicBands);

        mbA.compareMusicBand(mbB);
        System.out.println(musicBands);
    }
}