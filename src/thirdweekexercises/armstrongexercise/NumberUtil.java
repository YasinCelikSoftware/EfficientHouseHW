package thirdweekexercises.armstrongexercise;

public class NumberUtil {
    public static void main(String[] args) {

        test();

    }
    public static boolean isArmstrong(int number) {

        int total = 0;
        int digitsOfNumber = countDigits(number);

        if (number < 0) {
            return false;
        }

        for (int temporaryNumber = number; temporaryNumber > 0; temporaryNumber /= 10) {

            total += pow(temporaryNumber % 10, digitsOfNumber);

        }

        return total == number;

    }


    public static int countDigits(int a) {

        int count = 0;

        for (int i = a; i > 0; i /= 10)
            count++;

        return count;

    }

    public static int pow(int a, int b) {


        int total = 1;

        for (int x = 0; x < b; x++)
            total *= a;

        return total;

    }

    public static void display(int number) {
        if (isArmstrong(number))
            System.out.printf("--> %6d%n", number);
    }

    public static void test(){
        for(int a = 0; a<1000000; a++){
            display(a);
        }
    }

}