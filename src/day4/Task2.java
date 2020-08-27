package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10001);

        int min = 10000;
        int max = 0;
        int evenTen = 0;
        int sumEvenTen = 0;
        for (int i : array) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
            if (i % 10 == 0) {
                evenTen++;
                sumEvenTen += i;
            }
        }
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + evenTen);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumEvenTen);
    }
}