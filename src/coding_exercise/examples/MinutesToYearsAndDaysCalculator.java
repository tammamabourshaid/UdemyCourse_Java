package coding_exercise.examples;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(1051200L);
    }

        public static void printYearsAndDays(long minutes) {

            if (minutes >= 0) {
                long days = (minutes / 60) / 24 % 365;
                long years = (minutes / 60) / 24 / 365;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            } else {
                System.out.println("Invalid Value");
            }
        }
    }


