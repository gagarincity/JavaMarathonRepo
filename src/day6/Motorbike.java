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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int calculateYearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
