package CodingExercise.Examples;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(17,75));
    }
        public static boolean hasSharedDigit(int numberOne, int numberTwo) {

            if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
                return false;
            }
            int numberDigitATwo = numberOne % 10;
            int numberDigitAOne = numberOne / 10;
            int numberDigitBTwo = numberTwo % 10;
            int numberDigitBOne = numberTwo / 10;

            if (numberDigitAOne == numberDigitBOne || numberDigitAOne == numberDigitBTwo || numberDigitATwo == numberDigitBOne || numberDigitATwo == numberDigitBTwo) {
                return true;
            } else
                return false;
        }
    }
