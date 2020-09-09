package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Task1Numbers");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for (String number : numbers)
            sum += Integer.parseInt(number);

        double srArr = (double) sum / numbers.length;
        System.out.print(srArr);
        System.out.print(" --> ");
        System.out.printf("%.3f", srArr);
        sc.close();
    }
}
