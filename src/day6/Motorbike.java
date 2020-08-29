package day6;

import java.util.Scanner;

public class Motorbike {
    Scanner scanner = new Scanner(System.in);
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    void info() {
        System.out.println("Этот мотоцикл : " + model);
    }

    int calculateYearDifference() {
        System.out.print("Введите год для мото: ");
        int years = scanner.nextInt() - year;
        System.out.println("Разница между переданным годом и годом выпуска мото: " + years);
        return years;
    }
}
