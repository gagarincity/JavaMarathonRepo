package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический метод
 * List<String> parseFileToStringList(), который считывает содержимое этого файла и возвращает список,
 * состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
 * и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
 * необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 * <p>
 * Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
 * <p>
 * <p>
 * Пример содержания файла people.txt:
 * Mike 24
 * John 19
 * Anna 20
 * Miguel 5
 */

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(parseFileToStringList());
            for (int i = 0; i < parseFileToStringList().size(); i++) {
                String[] agePeople = parseFileToStringList().get(i).split(" ");
                int age = Integer.parseInt(agePeople[1]);
                if (age <= 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<String> parseFileToStringList() throws FileNotFoundException {
        File file = new File("people");
        List<String> namesAndAges = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext())
            namesAndAges.add(scanner.nextLine());

        return namesAndAges;
    }
}
