package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static List<Human> parseFileToObjList() throws FileNotFoundException {
        File file = new File("people");
        List<Human> human = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String line;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            String[] x = line.split(" ");
            String name = x[0];
            int age = Integer.parseInt(x[1]);
            human.add(new Human(name, age));
        }
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
