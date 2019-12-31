package coding_exercise.examples;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(-1, 4.0));
        System.out.println(sum(2,3));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }

    public static int sum (int a , int b){
         return  a-=b;
    }


}
