package coding_exercise.examples;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(54321));
    }
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;

        if (number >= 0) {
            lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            number += lastDigit;
        } else {
            return -1;
        }
        return number;
    }
}
