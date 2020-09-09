package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File file1 = new File("day16File1");
        FileWriter fw1 = new FileWriter(file1);
        FileWriter fw2 = new FileWriter("day16File2");

        int[] numbers = new int[100];
        int bound = 1000;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(bound);
            fw1.write(numbers[i] + " ");
        }
        fw1.close();
        int startIndex = 0;
        int endIndex = 20;
        int sum = 0;
        double averageValue;

        List<Double> numbersList = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
            averageValue = (double) sum / 20;
            numbersList.add(averageValue);
            startIndex += 20;
            endIndex += 20;
            if (endIndex > bound)
                break;
        }

        fw2.write(numbersList + " ");
        fw2.close();
        double sum2 = 0;
        int quantity = 50;
        for (int i = 0; i < quantity; i++) {
            sum2 += numbersList.get(i);
        }
        System.out.println((int) sum2);
    }
}
