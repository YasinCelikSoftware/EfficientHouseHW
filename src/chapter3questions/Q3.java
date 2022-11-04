package chapter3questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        calculateNewton();
    }

    public static void calculateNewton(){
        java.util.Scanner kb = new Scanner(System.in);
        final double G = 9.81;

        while(true) {
            System.out.println("\n\" 0 \" --> Exit");
            System.out.println("\" 1 \" --> Calculate newton on earth.");
            System.out.println("\" 2 \" --> Calculate newton on moon.\n");

            System.out.print("Please choose an option : ");
            int choice = kb.nextInt();

            if(choice==0)
                break;


            System.out.print("Please enter the car kilogram : ");
            double carKilogram = kb.nextInt();

            System.out.println();

            if(choice == 1) {
                double nOnEarth = carKilogram*G;
                System.out.printf("%.2f kg car on earth is %.2f Newton.%n%n",carKilogram,nOnEarth);
            }
            if(choice == 2) {
                double nOnMoon = (carKilogram*G)/6;
                System.out.printf("%.2f kg car on moon is %.2f Newton.%n%n",carKilogram,nOnMoon);
            }

        }
    }
}

