package day12.Task5;

import java.util.ArrayList;

public class MusicBand3 {
    private String name;
    private int year;
    private ArrayList<MusicArtist> musicArtists;

    public ArrayList<MusicArtist> getMusicArtists() {
        return musicArtists;
    }

    public MusicBand3(String name, int year, ArrayList<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "Музыкальная группа: " +
                "имя: '" + name + '\'' +
                ", год: " + year + ", " + getMusicArtists();
    }

    public void compareMusicBand(MusicBand3 musicBand) {
        ArrayList<MusicArtist> copyBandList = musicBand.getMusicArtists();
        musicArtists.addAll(copyBandList);
        copyBandList.removeAll(musicArtists);
    }
}