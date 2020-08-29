package day6;

import java.util.Scanner;

public class Plane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuelInTank = 0;

    public Plane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelInTank);
    }

    int fillUp(int fuel) {
        fuelInTank = fuel + fuelInTank;
        return fuel;
    }
}
