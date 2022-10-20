package firstweekexercises;

public class ArcadeExercise {
    public static void main(String[] args) {

        int coupons = 52;
        int candyBar = 10;
        int gumball = 3;

        int candyBarCalculator = coupons / candyBar;
        int gumballCalculator = (coupons % 10) / gumball;
        int couponsRemaining = (coupons % 10) % gumball;


        System.out.printf("You can get %d candy bar(s) and %d gumball(s) with %d coupons. And remains %d coupons."
                , candyBarCalculator, gumballCalculator, coupons, couponsRemaining);

    }
}
