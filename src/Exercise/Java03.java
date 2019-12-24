package Exercise;

public class Java03 {

    public void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }


    public void displayHighScorePosition(String playerName, int position) {

        System.out.println("managed to get into the high score " + playerName);
        System.out.println("on the high score table " + position);

    }

    public int calculateHighScorePosition(int playScore) {

        if (playScore >= 1000) {
            return 1;
        } else if (playScore > 500 && playScore < 1000) {
            return 2;
        } else if (playScore > 100 && playScore < 500) {
            return 3;
        }
        return 4;
    }
}