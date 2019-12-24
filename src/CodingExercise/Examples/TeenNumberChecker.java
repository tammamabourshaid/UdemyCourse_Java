package CodingExercise.Examples;

public class TeenNumberChecker {
    public static void main(String[] args) {
boolean teen = hasTeen(100,25,99);
        System.out.println(teen);

    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        if ((number1 >= 13 && number1 <= 19) || (number2 >= 13 && number2 <= 19) || (number3 >= 13 && number3 <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age1) {
        if (age1 >= 13 && age1 <= 19) {
            return true;
        }
        return false;

    }
}
