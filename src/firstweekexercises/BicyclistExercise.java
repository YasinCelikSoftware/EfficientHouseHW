package firstweekexercises;

public class BicyclistExercise {
    public static void main(String[] args) {

        double speedMph;
        double gearSize = 100;
        double cadenceRpm = 90;
        double inchToFt = 1d/12;
        double ftToMile = 1.0/5280.0;
        double hourToMinutes = 60;

        speedMph = gearSize * Math.PI * inchToFt * ftToMile * cadenceRpm * hourToMinutes;
        System.out.printf("With %f inches gear size and %f rpm cadence, your speed is %.2f MPH.",gearSize,cadenceRpm,speedMph);

    }

}
