package chapter3otherquestions;

public class NumeralExercise {
    public static void main(String[] args) {
        display();
    }

    public static int input() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Please enter the numeric combination : ");
        return kb.nextInt();
    }

    public static String symbolize(int input) {
        String numeral = "" + input;
        String result = "";
        for (int i = 0; i < numeral.length(); i++) {

            switch (numeral.charAt(i)) {
                case '0':
                    result += '*';
                    break;
                case '1':
                    result += 'B';
                    break;
                case '2':
                    result += 'E';
                    break;
                case '3':
                    result += 'A';
                    break;
                case '4':
                    result += '@';
                    break;
                case '5':
                    result += 'F';
                    break;
                case '6':
                    result += 'K';
                    break;
                case '7':
                    result += '%';
                    break;
                case '8':
                    result += 'R';
                    break;
                case '9':
                    result += 'M';
                    break;

            }

        }
        if (isDigitsEven(input,result)) {
            if(result.length() == 1)
                return "$";
            result = "$" + result.substring(1, result.length() - 1) + "$";
            System.out.print("The first and last digit of this number is even, because of this ");
        }
        if (isDigitsOdd(input,result)) {
            if(result.length() == 1)
                return "X";
            result = "X" + result.substring(1, result.length() - 1) + "X";
        }
        if (input % 10 == 0)
            result = result.substring(0, result.length() - 1) + "#";
        return result;
    }

    public static void display() {
        System.out.printf("Equivalent of this number is : %s", symbolize(input()));
    }

    public static boolean isDigitsEven(int input, String result)
    {
        return (input % 10) % 2 == 0 && (int) (input / Math.pow(10, result.length() - 1)) % 2 == 0;
    }

    public static boolean isDigitsOdd(int input, String result)
    {
        return (input % 10) % 2 != 0 && (int) (input / Math.pow(10, result.length() - 1)) % 2 != 0;
    }



}