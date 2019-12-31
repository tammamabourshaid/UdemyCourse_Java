package coding_exercise.examples;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }

        public static boolean isCatPlaying(boolean summer, int temperature){

            int minTemp=25;
            int maxTemp = summer ? 45:35;

            if(temperature<minTemp || temperature>maxTemp){
                return false;
            }
            return true;
        }
    }

