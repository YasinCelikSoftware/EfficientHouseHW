package secondweekexercises.extras.armstrongnumbers;

public class NumberUtil {
    public static void isArmstrong() {
        int a = 0;
        int c;
        int armstrongCounter = 0;

        while (a < 1000000) {

            int total = 0;
            int b = a;
            int digitsOfNumber = countDigits(a);

            if (a < 0) {
                System.out.println("Negative numbers can't be an armstrong number.");
                return;
            }

            while (b > 0) {

                c = b % 10;
                b /= 10;
                total += pow(c, digitsOfNumber);

            }

            if (total == a) {
                System.out.printf("%2d. Armstrong number is : %6d%n",++armstrongCounter,a);
            }

            a++;
        }
    }

    public static int countDigits(int a) {

        int count = 0;

        while (a != 0) {
            a /= 10;
            count++;
        }

        return count;

    }

    public static int pow(int a, int b){

        int x = 0;
        int total = 1;

        while(x < b){
            total *= a;
            x++;
        }

        return total;

    }

}