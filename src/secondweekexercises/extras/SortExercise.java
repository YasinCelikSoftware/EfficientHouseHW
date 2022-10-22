package secondweekexercises.extras;
// Turnary operator ile tekrar yapılacak.

import java.util.Scanner;

public class SortExercise {
    public static void main(String[] args) {
        test();

    }

    public static int findMax(int number1, int number2) {
        return number1 >= number2 ? number1 : number2;
    }

    public static int findMin(int number1, int number2) {
        return number1 <= number2 ? number1 : number2;
    }

    public static void displayResult(int min, int mid, int max) {
        if (min == mid) {
            System.out.printf("%d = %d", min, mid);
        } else {
            System.out.printf("%d < %d", min, mid);
        }

        if (mid == max) {
            System.out.printf(" = %d", max);
        } else {
            System.out.printf(" < %d", max);
        }
    }

    public static void test(){

        java.util.Scanner kb = new Scanner(System.in);

        System.out.println("This is a number sorting application.");

        System.out.print("Please enter the first number : ");
        int number1 = kb.nextInt();

        System.out.print("Please enter the second number : ");
        int number2 = kb.nextInt();

        System.out.print("Please enter the third number : ");
        int number3 = kb.nextInt();

        //sortNumbers(number1,number2,number3);
        //sortThem(number1, number2, number3);

        int max = findMax(number1, findMax(number2, number3));
        int min = findMin(number1, findMin(number2, number3));
        int mid = (number1 + number2 + number3) - (max + min);

        displayResult(min, mid, max);

    }


}

