package secondweekexercises;

import java.util.Scanner;

public class HourExercise {
    public static void main(String[] args) {

        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the total seconds : ");
        int secondsTotal = kb.nextInt();

        int minuteToSecond = 60;
        int hourToMinute = 60;

        int minutesTotal = secondsTotal / minuteToSecond;
        int hours = minutesTotal / hourToMinute;
        int minutes = (minutesTotal % hourToMinute);
        int seconds = (secondsTotal % minuteToSecond);



        System.out.printf("%d seconds equals to %d hour(s) %d minute(s) %d second(s).",secondsTotal,hours,minutes,seconds);

    }


}
