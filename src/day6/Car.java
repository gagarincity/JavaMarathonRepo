package day6;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    void info() {
        System.out.println("Это автомобиль: " + model);
    }

    int calculateYearDifference() {
        System.out.print("Введите год для авто: ");
        int years = scanner.nextInt() - year;
        System.out.println("Разница между переданным годом и годом выпуска авто: " + years);
        return years;
    }
}
