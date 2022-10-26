package secondweekexercises.extras.armstrongnumbers;

public class NumberUtil {
    public static boolean isArmstrong(int number) {

        int valueOfDigit;


        int total = 0;
        int temporaryNumber = number;
        int digitsOfNumber = countDigits(number);

        if (number < 0) {
            return false;
        }

        while (temporaryNumber > 0) {

            valueOfDigit = temporaryNumber % 10;
            temporaryNumber /= 10;
            total += pow(valueOfDigit, digitsOfNumber);

        }

        if (total == number) {
            return true;
        }
        return false;
    }


    public static int countDigits(int a) {

        int count = 0;

        while (a != 0) {
            a /= 10;
            count++;
        }

        return count;

    }

    public static int pow(int a, int b) {

        int x = 0;
        int total = 1;

        while (x < b) {
            total *= a;
            x++;
        }

        return total;

    }

    public static void display(int number) {
        if (isArmstrong(number))
            System.out.printf("--> %6d%n", number);
    }

}