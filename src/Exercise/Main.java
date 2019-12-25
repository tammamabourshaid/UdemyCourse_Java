package Exercise;

public class Main {
    public static void main(String[] args) {
       System.out.println(calculateScore("tom", 5));
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;


    }

    
}
