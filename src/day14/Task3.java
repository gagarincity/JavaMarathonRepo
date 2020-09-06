package day14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < Human.parseFileToObjList().size(); i++) {
                if (Human.parseFileToObjList().get(i).getAge() < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
            }

            System.out.println(Human.parseFileToObjList());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
