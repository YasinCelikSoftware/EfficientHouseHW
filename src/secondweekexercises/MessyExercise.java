package secondweekexercises;

import java.util.Scanner;

public class MessyExercise {
    public static final double DISTANCE = 180;

    public static void main(String[] args){

        java.util.Scanner kb = new Scanner(System.in);
        double time;
        double averageSpeed;


        System.out.println("This program calculates your pace given a time and distance traveled.");

        System.out.print("Please enter the time : ");
        time = kb.nextDouble();

        averageSpeed = DISTANCE / time;
        System.out.printf("Your pace is %.2f miles per hour.",averageSpeed);
    }
}
