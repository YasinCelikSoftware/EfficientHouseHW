package secondweekexercises.extras;

import java.util.Scanner;

public class SignumExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number which is want to know the sign : ");

        int number = findSign(kb.nextInt());

        System.out.println("*************** Please wait, we are finding the sign. ***************");

        if(number == 1) {
            System.out.printf("%d (This number is bigger than zero.)", number);
        }
        if (number == -1) {
            System.out.printf("%d (This number is lower than zero.)",number);
        }
        if(number == 0){
            System.out.printf("%d (This number is equals the zero.)",number);
        }
    }

    public static int findSign(int number){

        if(number>0){
            return 1;
        } else if (number < 0) {
            return -1;
        } else{
            return 0;
        }
    }
}


