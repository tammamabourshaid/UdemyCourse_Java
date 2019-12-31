package coding_exercise.examples;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first<10 || second<10) {
            return -1;
        }
        int commonDivisor = 1;
        for(int i=2; i<=((first<second)?first:second); i++) {
            if ( (first % i) == 0 && (second % i) == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}