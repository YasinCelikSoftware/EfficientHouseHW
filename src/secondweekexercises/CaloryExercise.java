package secondweekexercises;

import java.util.Scanner;

public class CaloryExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the running time : ");
        int runningTime = kb.nextInt();

        System.out.print("Please enter the basketball time : ");
        int basketballTime = kb.nextInt();

        System.out.print("Please enter the sleep time : ");
        int sleepTime = kb.nextInt();

        System.out.print("Please enter the pounds you have : ");
        int pounds = kb.nextInt();

        double kilograms = pounds / 2.2;
        double runningCalories = 0.0175 * 10 * kilograms * runningTime;
        double basketballCalories = 0.0175 * 8 * kilograms * basketballTime;
        double sleepCalories = 0.0175 * 1 * kilograms * sleepTime;

        double calories = runningCalories + basketballCalories + sleepCalories;

        System.out.printf("That person burned %.2f calories.",calories);


    }

}
