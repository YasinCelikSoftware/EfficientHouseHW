package thirdweekexercises.whileexampleswithfor;
/*
	 Write a method named sumDigits that will take an int argument and returns sum of all digits.
*/
public class WhileExample6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d -> sum of digits = %d%n", val, sumDigits(val));
    }

    public static int sumDigits(int val)
    {
        int sum = 0;

        for(int i = val; i>0;i /= 10){

            sum += i%10;

        }

        return sum;
    }
}
