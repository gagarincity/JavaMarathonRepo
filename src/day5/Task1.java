package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1970);
        car1.setColor("Black");
        car1.setModel("Ford");

        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
    }
}
