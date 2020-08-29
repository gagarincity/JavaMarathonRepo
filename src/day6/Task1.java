package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ford");
        car1.setYear(1995);
        car1.info();

        Motorbike motorbike1 = new Motorbike(1970, "white", "Bmw");
        motorbike1.info();

        car1.calculateYearDifference();
        motorbike1.calculateYearDifference();
    }
}
