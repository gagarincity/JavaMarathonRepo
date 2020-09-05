package day12.Task5;

import java.util.List;

public class MusicBand3 {
    private String name;
    private int year;
    private List<MusicArtist> musicArtist;

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public MusicBand3(String name, int year, List<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    @Override
    public String toString() {
        return "Музыкальная группа: " +
                "имя: '" + name + '\'' +
                ", год: " + year + ", " + getMusicArtist();
    }

    public static void mergeMusicBand(MusicBand3 a, MusicBand3 b) {
        for (MusicArtist member : a.getMusicArtist())
            b.getMusicArtist().add(member);
        a.getMusicArtist().clear();
    }
}