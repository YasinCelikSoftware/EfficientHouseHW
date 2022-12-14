package chapter3questions;

public class Q6 {
    public static void main(String[] args) {
        input();
    }

    public static void greenCrudCalculator() {


        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter day : ");
        int numberOfDays = kb.nextInt();

        System.out.print("Please enter the green crud population (Pounds) : ");
        int oldCrud = kb.nextInt();

        int newCrud = 0, total = 0;

        for (int i = 0; i <= numberOfDays / 5; i++) {

                total = newCrud + oldCrud;
                oldCrud = newCrud;
                newCrud = total;


        }

        display(numberOfDays,total);

    }


    public static void input() {

        System.out.println("Welcome to green crud calculating program.\n");

        while (true) {

            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.println("0 --> Exit.");
            System.out.println("1 --> Continue.\n");


            System.out.print("Please enter your choice : ");
            int exitCondition = kb.nextInt();

            if (exitCondition == 0)
                break;

            greenCrudCalculator();
        }
    }

    public static void display(int numberOfDays, int total){

        System.out.printf("\nThe total green crud population in %d days is : %d%n%n", numberOfDays, total);

    }


}
