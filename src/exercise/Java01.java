package exercise;

public class Java01 {
    public static void main(String[] args) {
        System.out.println("hello");
        Calc calc = new Calc();
//        System.out.println(calc.calc(1, 3));

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        System.out.println("max " + maxValue);
        System.out.println("min " + minValue);
        long l = Long.MIN_VALUE;
        System.out.println(l);
        byte B = (byte) (l);
        float v = 2 / 5f;
        System.out.println(v);
        char ch = '\u00C0';
        System.out.println(ch);
        int result = 2;
        result++;
        System.out.println("++" + result);
        result--;
        System.out.println("--" + result);
        result += 5;
        System.out.println("+=" + result);
        result *= 3;
        System.out.println("*=" + result);
        boolean Action = true;
        if (Action == false) {
            System.out.println("Okay");
        }
        int score = 10;
        if (score != 50) {
            System.out.println("gooool");
            int a = 31;
            int b = 2;
            boolean wasCar = (a < b) ? true : false;
            if (wasCar) {
                System.out.println("was Car");

            }

        }
        int a = -10;
        int absValue = (a < 0) ? a : -a;
        System.out.println(absValue);


        String name = "Tamam";
        String yes = "YESSSS";
        String No = "NO!!";

        String text = name.equals("Tamam") ? yes : No;
        System.out.println(text);
    }
}
