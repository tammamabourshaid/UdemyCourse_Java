package coding_exercise.examples;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-1));
    }
    public static boolean isPalindrome(int number){
        int reverse=0;
        int lastdigit;
        int num = number;
        while((number>0)||(number<0)){
            lastdigit= number%10;
            reverse = reverse*10;
            reverse = reverse+lastdigit;
            number/=10;
        }
        number=num;
        if(number==reverse){
            return true;
        }
        else {
            return false;
        }
    }

}
