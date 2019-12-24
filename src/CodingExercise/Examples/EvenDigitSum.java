package CodingExercise.Examples;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number){
        if(number >= 0){

            int sum = 0;

            while(number>0){
                int digit = number % 10;
                number/= 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
            }return sum;
        }
        return -1;
    }
}
