package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("A", 2010);
        MusicBand mb2 = new MusicBand("B", 2009);
        MusicBand mb3 = new MusicBand("C", 2000);
        MusicBand mb4 = new MusicBand("D", 1998);
        MusicBand mb5 = new MusicBand("E", 1990);
        MusicBand mb6 = new MusicBand("F", 2003);
        MusicBand mb7 = new MusicBand("G", 2001);
        MusicBand mb8 = new MusicBand("H", 1999);
        MusicBand mb9 = new MusicBand("I", 1994);
        MusicBand mb10 = new MusicBand("J", 1997);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);

        Collections.shuffle(musicBands);

        List<MusicBand> musicBands2 = new ArrayList<>();
        for (int i = 0; i < musicBands.size(); i++)
            if (musicBands.get(i).getYear() > 2000)
                musicBands2.add(musicBands.get(i));


        System.out.println(musicBands);
        System.out.println(musicBands2);
    }
}
