package decemberextrahomeworks;

public class Duration {
    public static void main(String[] args)
    {
        run();
    }
    public static void displayDuration(long totalSeconds)
    {
        if(totalSeconds < 1)
        {
            System.out.println("Please enter a valid value.");
            return;
        }

        long remainingSeconds;

        int seconds = (int)totalSeconds % 60;
        remainingSeconds = (totalSeconds - seconds) / 60;

        int minutes = (int)remainingSeconds % 60;
        remainingSeconds = (remainingSeconds - minutes) / 60;

        long hours = remainingSeconds;

        String time = totalSeconds + " seconds is equals to : ";

        if(hours != 0)
            time += hours + " hour(s) ";
        if(minutes != 0)
            time += minutes + " minute(s) ";
        if(seconds != 0)
            time += seconds + " second(s).";

        System.out.println(time);
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter total seconds : ");
        int totalSeconds = kb.nextInt();

        displayDuration(totalSeconds);
    }
}
