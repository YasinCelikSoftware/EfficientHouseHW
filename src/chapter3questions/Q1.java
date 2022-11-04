package chapter3questions;

public class Q1 {
    public static void main(String[] args) {
        test();
    }

    public static double sqrtBabylonian(double number) {

        if(number == 0)
            return 0;

        double guess = number / 2;
        double lastGuess;

        do {
            lastGuess = guess;
            double r = number / guess;
            guess = (guess + r) / 2;

        } while ((lastGuess - guess) >= 0.01);

        return guess;
    }

    public static void display(double number){
        System.out.printf("Square root of %.0f is %.2f%n", number, sqrtBabylonian(number));
    }

    public static void test() {

       for(int i = 0; i < 1001; i++){
           display(i);
       }


    }
}
