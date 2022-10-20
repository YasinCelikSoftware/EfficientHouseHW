package firstweekexercises;

public class HourExercise {
    public static void main(String[] args) {
        int secondsTotal = 27_382;
        int minuteToSecond = 60;
        int hourToMinute = 60;

        int minutesTotal = secondsTotal / minuteToSecond;
        int hours = minutesTotal / hourToMinute;
        int minutes = (minutesTotal % hourToMinute);
        int seconds = (secondsTotal % minuteToSecond);


        System.out.printf("%d seconds equals to %d hour(s) %d minute(s) %d second(s).", secondsTotal, hours, minutes, seconds);

    }
}
