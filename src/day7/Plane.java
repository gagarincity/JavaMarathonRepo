package day7;

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

    public static void whoLonger(Plane plane1, Plane plane2) {
        if (plane1.length > plane2.length)
            System.out.println("Первый самолет длиннее");
        else if (plane2.length > plane1.length) {
            System.out.println("Второй самолет длиннее");
        } else
            System.out.println("Оба самолета одинаковой длины");
    }
}
