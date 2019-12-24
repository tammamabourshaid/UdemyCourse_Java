package Exercise;

public class Calc {
    public int calc(int i, int i1) {
        int y = i + i1;
        return y;
    }

    public static void main(String[] args) {
        Java03 java03 = new Java03();
        java03.calculateScore(true, 100, 2, 50);
        java03.calculateScore(true, 50, 2, 60);

        Calc calc = new Calc();
        int calc1 = calc.calc(5, 4);
        System.out.println(calc1);

        Java02 java02 = new Java02();
        java02.cond();
        int score = java02.score;
        System.out.println(score);

        int highScorePosition1 = java03.calculateHighScorePosition(1000);
        java03.displayHighScorePosition("tammam1", highScorePosition1);

        int highScorePosition2 = java03.calculateHighScorePosition(500);
        java03.displayHighScorePosition("tammam2", highScorePosition2);

        int highScorePosition3 = java03.calculateHighScorePosition(100);
        java03.displayHighScorePosition("tammam3", highScorePosition3);

        int highScorePosition4 = java03.calculateHighScorePosition(50);
        java03.displayHighScorePosition("tammam4", highScorePosition4);


    }
}