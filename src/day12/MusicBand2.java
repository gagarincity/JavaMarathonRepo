package day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand2 {
    private String name;
    private int year;
    private List<String> musicArtist;

    public List<String> getMusicArtist() {
        return musicArtist;
    }

    public MusicBand2(String name, int year, List<String> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year + " " + getMusicArtist() +
                '}';
    }

    public static void mergeMusicBand(MusicBand2 a, MusicBand2 b) {
        for (String members : a.getMusicArtist())
            b.getMusicArtist().add(members);
        a.getMusicArtist().clear();
    }
}