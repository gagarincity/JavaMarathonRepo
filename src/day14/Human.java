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

    public static List<Human> parseFileToObjList() {
        File file = new File("people");
        List<Human> namesAndAges = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] human = line.split(" ");

                if (Integer.parseInt(human[1]) < 0)
                    throw new IllegalArgumentException();
                Human human1 = new Human(human[0], Integer.parseInt(human[1]));
                namesAndAges.add(human1);
            }

            return namesAndAges;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входной файл");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
