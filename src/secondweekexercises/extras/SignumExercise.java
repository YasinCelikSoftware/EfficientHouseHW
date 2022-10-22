package secondweekexercises.extras;

import java.util.Scanner;

public class SignumExercise {
    public static void main(String[] args) {

        test();
    }

    public static int findSign(int number){

        if (number > 0) { return 1; }

        if (number < 0) { return -1; }

        return 0;

    }

    public static void test(){

        java.util.Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number which is want to know the sign : ");

        int number = findSign(kb.nextInt());

        System.out.println("*************** Please wait, we are finding the sign. ***************");

        if (number == 1) { System.out.printf("%d (This number is bigger than zero.)", number); }
        if (number == -1) { System.out.printf("%d (This number is lower than zero.)",number); }

        System.out.printf("%d (This number is equals the zero.)",number);

    }
}


