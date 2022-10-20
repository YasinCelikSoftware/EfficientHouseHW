package secondweekexercises;

import java.util.Scanner;

public class AracadeExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter amount of coupons : ");
        int coupons = kb.nextInt();
        int candyBar = 10;
        int gumball = 3;

        int candyBarCalculator = coupons / candyBar;
        int gumballCalculator = (coupons % 10)/ gumball;
        int couponsRemaining = (coupons % 10) % gumball;


        System.out.printf("You can get %d candy bar(s) and %d gumball(s) with %d coupons. And remains %d coupons."
                ,candyBarCalculator,gumballCalculator, coupons, couponsRemaining);

    }
}
