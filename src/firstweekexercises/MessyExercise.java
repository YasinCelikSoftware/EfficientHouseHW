package firstweekexercises;

public class MessyExercise {
    public static final double DISTANCE = 180;
    public static void main(String[] args){
        double time;
        double averageSpeed;


        System.out.println("This program calculates your pace given a time and distance traveled.");
        time = 20.5; /* 35 minutes and 30 seconds */
        averageSpeed = DISTANCE / time;
        System.out.printf("Your pace is %.2f miles per hour.",averageSpeed);
    }
}
