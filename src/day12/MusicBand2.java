package day12;

import java.util.ArrayList;

public class MusicBand2 {
    private String name;
    private int year;
    private ArrayList<String> musicArtist;

    public ArrayList<String> getMusicBandMember() {
        return musicArtist;
    }

    public MusicBand2(String name, int year, ArrayList<String> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year + " " + getMusicBandMember() +
                '}';
    }

    public void compareMusicBand(MusicBand2 musicBand) {
        ArrayList<String> copyBandList = musicBand.getMusicBandMember();
            musicArtist.addAll(copyBandList);
            copyBandList.removeAll(musicArtist);
    }
}