package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();

        System.out.println(warehouse);
        System.out.println("Сборщик заработал: " + picker.getSalary());
        System.out.println("Курьер заработал: " + courier.getSalary());
    }
}
