package thirdweekexercises;

import java.util.Scanner;

public class GetPrimeExercise {
    public static void main(String[] args) {
        test();
    }

    public static boolean isPrime(long number){
        if (number % 2 == 0)
            return number == 2;


        for(long l = 3; l * l <= number; l += 2){

            if(number % l == 0)
                return false;

        }

        return true;
    }

    public static int getPrime(int number){
        int count = 1;

            for (int i = 1; i <= number; i+=2) {
                if (isPrime(i))
                    count++;

        }
        return count;
    }

    public static void display(int number){
        if(isPrime(number))
            System.out.printf("%d number is %d. prime number.",number,getPrime(number));
        else
            System.out.println("This is not an prime.");

    }

    public static void test(){

        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        display(kb.nextInt());

    }
}
