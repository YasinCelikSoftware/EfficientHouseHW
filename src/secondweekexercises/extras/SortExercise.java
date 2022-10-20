package secondweekexercises.extras;

import java.util.Scanner;

public class SortExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);

        System.out.println("This is a number sorting application.");

        System.out.print("Please enter the first number : ");
        int number1 = kb.nextInt();

        System.out.print("Please enter the second number : ");
        int number2 = kb.nextInt();

        System.out.print("Please enter the third number : ");
        int number3 = kb.nextInt();

        sortNumbers(number1,number2,number3);
        sortThem(number1,number2,number3);
    }

    public static void sortNumbers(int number1, int number2, int number3){

        if (number1 == number2 && number1 == number3)
            System.out.printf("%d = %d = %d",number1,number2 ,number3);
//********************* 1-2 equals
        if(number1 == number2 && number1 > number3)
            System.out.printf("%d < %d = %d", number3, number2, number1);

        else if(number1 == number2 && number1 < number3)
            System.out.printf("%d = %d < %d", number1, number2, number3);
//********************* 1-3 equals
        if(number1 == number3 && number1 > number2)
            System.out.printf("%d < %d = %d", number2, number1, number3);

        else if(number1 == number3 && number1 < number2)
            System.out.printf("%d = %d < %d", number1, number3, number2);
//********************** 2-3 equals
        if(number2 == number3 && number2 > number1)
            System.out.printf("%d < %d = %d", number1, number2, number3);

        else if(number2 == number3 && number2 < number1)
            System.out.printf("%d = %d < %d", number2, number3, number1);

//*******************************

        // 1<2<3
        if(number1 < number2 && number2 < number3)
            System.out.printf("%d < %d < %d",number1,number2,number3);
            //1<3<2
        else if(number1 < number3 && number3<number2)
            System.out.printf("%d < %d < %d", number1,number3,number2);
            //2<1<3
        else if(number2<number1 && number1 < number3)
            System.out.printf("%d < %d < %d",number2,number1,number3);
            //2<3<1
        else if(number2<number3 && number3 < number1)
            System.out.printf("%d < %d < %d", number2,number3,number1);
            //3<2<1
        else if(number3 < number2 && number2 < number1)
            System.out.printf("%d < %d < %d", number3,number2,number1);
            //3<1<2
        else if(number3 < number1 && number1 < number2)
            System.out.printf("%d < %d < %d",number3,number1,number2);


    }



    public static void sortThem(int number1,int number2,int number3){
        int min = number1;
        int mid = findMid(number2,number3);
        int max = findBiggest(number2,number3);


        if(min>number2){
            min = number2;
            mid=findMid(number1,number3);
            max= findBiggest(number1,number3);
        }
        if(min>number3){
            min = number3;
            mid = findMid(number1,number2);
            max = findBiggest(number1,number2);
        }


        if(min == mid)
            System.out.print(min + " = " + mid);
        else
            System.out.print(min + " < " + mid);
        if(mid == max)
            System.out.println(" = " + max);
        else
            System.out.println(" < " + max);
    }
    public static int findMid(int number1,int number2){
        int mid = number1;

        if(number1>number2) {
            mid = number2;
        }
        return mid;
    }

    public static int findBiggest(int number1,int number2){
        int max = number1;
        if(max<number2)
            max = number2;
        return max;
    }

}

