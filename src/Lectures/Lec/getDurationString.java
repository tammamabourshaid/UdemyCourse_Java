package Lectures.Lec;

public class getDurationString {

    public static void main(String[] args) {
        String durationString = getDurationString(3200);
        System.out.println(durationString);
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "invalid Value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " h " + remainingMinutes + " m " + seconds + " s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "invalid value";
        }
        long minutes = seconds / 60;
        long remainSeconds = seconds % 60;
        return getDurationString(minutes, remainSeconds);
    }
}
