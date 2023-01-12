package chapter3questions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        enterTheSystem();
    }

    public static boolean isArmstrong(int number){

        if(number < 0)
            return false;

        int total = 0;


        for(int i = number; i > 0; i /= 10){

            total += pow(i % 10, countDigits(number));

        }

        return total == number;
    }

    public static int countDigits(int a) {

        int count = 0;

        for(int i = a; i > 0; i /= 10)
            count++;

        return count;
    }

    public static int pow(int a, int b){
        int total = 1;

        for(int i=0; i < b; i++)
            total *= a;

        return total;
    }

    public static void display(int number){

        if(isArmstrong(number))
            System.out.printf("%n--> %d", number);

    }

    public static void test(){
        java.util.Scanner kb = new Scanner(System.in);

        System.out.println("\nPlease enter the range...");

        System.out.print("\nStart number : ");
        int startValue = kb.nextInt();

        System.out.print("End number : ");
        int endValue = kb.nextInt();

        for(int i = startValue; i <= endValue; i++)
            display(i);

    }

    public static void enterTheSystem(){

        java.util.Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Armstrong number founder.");

        while (true){

            System.out.print("\nDo you want to continue? Y? or N? : ");
            String exitCondition = kb.nextLine();

            if(exitCondition.equalsIgnoreCase("N"))
                break;

           test();

        }
    }
}
