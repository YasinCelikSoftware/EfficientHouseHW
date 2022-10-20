package firstweekexercises;

public class CaloryExercise {
    public static void main(String[] args) {
        double calories = caloryCalculator(30, 30, 360, 150);
        System.out.printf("That person burned %.2f calories.", calories);


    }

    public static double caloryCalculator(int runningTime, int basketballTime, int sleepTime, int pounds) {
        double kilograms = pounds / 2.2;
        double runningCalories = 0.0175 * 10 * kilograms * runningTime;
        double basketballCalories = 0.0175 * 8 * kilograms * basketballTime;
        double sleepCalories = 0.0175 * 1 * kilograms * sleepTime;

        double calories;

        calories = runningCalories + basketballCalories + sleepCalories;
        return calories;

    }
}
