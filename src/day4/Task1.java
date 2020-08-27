package day4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 11);

        int more = 0;
        int equal = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i : array) {
            if (i > 8)
                more++;
            if (i == 1)
                equal++;
            if (i % 2 == 0)
                even++;
            if (i % 2 != 0)
                odd++;
            sum += i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + more);
        System.out.println("Количество чисел равных 1: " + equal);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
