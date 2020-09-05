package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();

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
