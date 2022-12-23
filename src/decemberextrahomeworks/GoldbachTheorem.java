package decemberextrahomeworks;

public class GoldbachTheorem {
    public static void main(String[] args) {
        test();
    }
    public static int findFirstPrime(int number)
    {
        for(int i = number; i > 2; i--)
        {
            if(isPrime(i) && isPrime(number - i))
                    return i;

        }
        return 0;
    }

    public static void display(int number){

        if(number % 2 != 0)
        {
            System.out.println("This number is not even.");
            return;
        }

        int firstPrime = findFirstPrime(number);
        System.out.printf("%d = %d + %d", number, firstPrime, number - firstPrime);
    }

    public static boolean isPrime(long number){
        if(number < 2)
            return false;

        if(number % 2 == 0)
            return number == 2;


        for(long l = 3; l*l <= number; l+=2){

            if(number%l == 0)
                return false;

        }

        return true;
    }

    public static void test(){

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter an even number : ");
        int number = kb.nextInt();

        display(number);
    }
}
