package thirdweekexercises;

public class IsPrimeExercise {
    public static void main(String[] args) {
        test();

    }

    public static boolean isPrime(long number){

        if(number < 2)
            return false;

        for(long l = 2; l < sqrt(number); l++){
            if(number%l == 0)
                return false;

        }

        return true;
    }

    public static long sqrt(long number){

        long i;

        for(i = 1; i<number; i++){

            if(i*i == number)
                return i;

            if(i*i>number)
                return i-1;

        }

        return 0;

    }

    public static void test(){

        for(long i = 0; i < 1000000 ; i++){

            if(isPrime(i))
                System.out.println(i);

        }

    }
}
