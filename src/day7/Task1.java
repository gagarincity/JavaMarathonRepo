package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane planeA = new Plane("Boeing", 2019, 180, 2000);
        Plane planeB = new Plane("Airbus", 2018, 200, 2500);

        Plane.whoLonger(planeA, planeB);
    }
}
