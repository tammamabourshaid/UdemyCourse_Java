package Lectures.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] variables = new int[10];
//        variables[3] = 20;
        for (int i = 0; i < 10; i++) {
            variables[i] = i;
            System.out.println( variables[i]);

        }
        printArray(variables);
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i]);
        }
//        System.out.println(variables[0]);
//        System.out.println(variables[1]);
//        System.out.println(variables[2]);
//        System.out.println(variables[3]);
//        System.out.println(variables[4]);
//        System.out.println(variables[5]);
//        System.out.println(variables[6]);
//        System.out.println(variables[7]);
//        System.out.println(variables[8]);
//        System.out.println(variables[9]);
//        System.out.println(variables[10]);
//        System.out.println(variables[11]);
    }
}
