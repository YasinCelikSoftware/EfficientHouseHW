package secondweekexercises.extras;

import java.util.Scanner;

public class MidExercise {

        public static void main(String[] args) {
            test();
        }


        public static int findMiddle(int number1, int number2, int number3) {

            if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) { return number1; }

            if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) { return number2; }

            return number3;

        }

        public static void test(){

            java.util.Scanner kb = new Scanner(System.in);

            System.out.println("This is a middle number finder application.");

            System.out.print("Please enter the first number : ");
            int number1 = kb.nextInt();

            System.out.print("Please enter the second number : ");
            int number2 = kb.nextInt();

            System.out.print("Please enter the third number : ");
            int number3 = kb.nextInt();

            System.out.printf("The middle number in these numbers is : %d",findMiddle(number1,number2,number3));

        }
}
