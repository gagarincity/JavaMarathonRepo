package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 0};
        System.out.println(A(numbers, numbers.length - 1));
    }

    public static int A(int[] numbers, int i) {
        if (i == 0)
            return numbers[i];
        return numbers[i] + A(numbers, i - 1);
    }
}
