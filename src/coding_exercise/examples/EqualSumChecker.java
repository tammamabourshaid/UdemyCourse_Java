package coding_exercise.examples;

public class EqualSumChecker {
    public static void main(String[] args) {
boolean result= hasEqualSum(1,1,1);
        System.out.println(result);
    }


    public static boolean hasEqualSum (int firstNumber , int secondNumber , int thirdNumber){
        if (firstNumber + secondNumber == thirdNumber){
            return true;
        } else return false;

    }
}
