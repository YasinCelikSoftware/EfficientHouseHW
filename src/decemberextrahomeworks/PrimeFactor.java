package decemberextrahomeworks;

public class PrimeFactor {
    public static void main(String[] args)
    {
        run();
    }
    public static void displayPrimeFactors(int number){

        System.out.printf("The prime factors of %d is : ", number);

        for(int i = 2; i <= number; i++)
        {
            if(isPrime(i) && number % i == 0)
            {
                System.out.print(i);
                number = number / i;

                if(number == 1)
                    break;

                System.out.print(" and ");
                i = 1;
            }
        }
    }

    public static boolean isPrime(long number)
    {
        if(number % 2 == 0)
            return number == 2;


        for(long l = 3; l*l <= number; l+=2)
        {

            if(number%l == 0)
                return false;

        }

        return true;
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter the number : ");
        int number = kb.nextInt();

        displayPrimeFactors(number);
    }
}
