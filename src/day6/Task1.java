package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("white");
        car1.setModel("Ford");
        car1.setYear(1995);

        Motorbike motorbike1 = new Motorbike(1970, "white", "Bmw");

        car1.info();
        motorbike1.info();

        System.out.println(car1.calculateYearDifference(2000));
        System.out.println(motorbike1.calculateYearDifference(5000));
    }
}
