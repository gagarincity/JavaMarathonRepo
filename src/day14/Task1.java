package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("Task1Numbers");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            List<Integer> numbersInt = new ArrayList<>();

            for (String number : numbers) {
                numbersInt.add(Integer.parseInt(number));
            }
            int sum = 0;

            for (int number : numbersInt) {
                sum += number;
            }
            System.out.println(numbersInt);
            System.out.println(sum);

            if (numbersInt.size() != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
