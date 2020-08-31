package day8;

public class Plane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuelInTank;

    public Plane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuelInTank = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelInTank);
    }

    public void fillUp(int fuel) {
        fuelInTank += fuel;
    }

    public String toString() {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelInTank;
    }
}
