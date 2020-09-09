package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File oldFile = new File("shoes.csv");
        File newFile = new File("shoesNew.txt");
        PrintWriter pw = new PrintWriter(newFile);

        Scanner scanner = new Scanner(oldFile);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] shoes = line.split(";");

            if (Integer.parseInt(shoes[2]) == 0) {
                pw.println(line);
            }
        }
        pw.close();
    }
}
