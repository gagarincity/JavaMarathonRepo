package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();

        car.add("BMW");
        car.add("Jeep");
        car.add("Toyota");
        car.add("Mini");
        car.add("Lexus");

        System.out.println(car);

        car.add(2, "Volvo");
        car.remove(0);

        System.out.println(car);
    }
}
