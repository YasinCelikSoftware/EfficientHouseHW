package secondweekexercises;

import java.util.Scanner;

public class BicyclistExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        double speedMph;
        System.out.print("Please enter the gear size : ");
        double gearSize = kb.nextDouble();
        System.out.print("Please enter the cadence : ");
        double cadenceRpm = kb.nextDouble();
        double inchToFt = 1d/12;
        double ftToMile = 1.0/5280.0;
        double hourToMinutes = 60;

        speedMph = gearSize * Math.PI * inchToFt * ftToMile * cadenceRpm * hourToMinutes;
        System.out.printf("With %.2f inches gear size and %.2f rpm cadence, your speed is %.2f MPH.",gearSize,cadenceRpm,speedMph);

    }
}
