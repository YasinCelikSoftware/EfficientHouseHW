package thirdweekexercises;

public class IsPrimeExercise {
    public static void main(String[] args) {
        test();
    }

    public static boolean isPrime(long number){
        if (number == 2)
            return true;

        if(number <= 1 || number%2 == 0)
            return false;


        for(long l = 3; l*l <= number; l+=2){

            if(number%l == 0)
                return false;

        }

        return true;
    }

    public static void test(){

        for(long i = 0; i < 1000000 ; i++){

            if(isPrime(i))
                System.out.println(i);

        }

    }
}
