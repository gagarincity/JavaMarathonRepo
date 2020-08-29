package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 2020, 100, 2000);
        plane.setYear(2010);
        plane.setLength(120);
        plane.fillUp(3400);
        plane.fillUp(5000);
        plane.info();
    }
}
