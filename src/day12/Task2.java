package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;
        while (i < 350) {
            if ((i <= 30 && i % 2 == 0) || (i >= 300 && i <= 350 && i % 2 == 0))
                numbers.add(i);
                i++;
        }
        System.out.println(numbers);
    }
}
