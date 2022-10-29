package thirdweekexercises.whileexampleswithfor;
/*
	 Write a method named countDigits that will take an int argument and returns total digits count.
*/
public class WhileExample5 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = abs(kb.nextInt());

        if (val != 0)
            System.out.printf("%d -> total digits count: %d", val, countDigits(val));
        else
            System.out.println("Invalid input (now)");
    }

    public static int countDigits(int val)
    {
        int count = 0;

        for(int i = val;i>0;i/=10) // This initialize was made in order not to leave the first part as blank.
            count++;

        return count;
    }

    public static int abs(int x)
    {
        return x < 0 ? -x : x;
    }
}
