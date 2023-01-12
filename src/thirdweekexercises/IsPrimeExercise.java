package thirdweekexercises;

public class IsPrimeExercise {
    public static void main(String[] args) {
        display(14);
    }

    public static boolean isPrime(long number){
        if(number % 2 == 0)
            return number == 2;


        for(long l = 3; l*l <= number; l+=2){

            if(number%l == 0)
                return false;

        }

        return true;
    }

    public static int getPrime(int number){
        int count = 0;
        if(isPrime(number)) {
            for (int i = 0; i <= number; i++) {
                if (isPrime(i))
                    count++;

            }
            return count;
        }
        return 0;
    }

    public static void display(int number){
        if(getPrime(number)==0) {
            System.out.println("This is not an prime number.");
            return;
        }
        System.out.printf("%d number is %d. prime number.",number,getPrime(number));

    }

    public static void test(){

        for(long i = 0; i < 1000000 ; i++){

            if(isPrime(i))
                System.out.println(i);

        }

    }
}
