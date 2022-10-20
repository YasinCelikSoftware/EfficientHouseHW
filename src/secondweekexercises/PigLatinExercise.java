package secondweekexercises;

import java.util.Scanner;

public class PigLatinExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the first name : ");
        String firstName = kb.nextLine();
        System.out.print("Please enter the last name : ");
        String lastName = kb.nextLine();
        firstName = firstName.trim();
        lastName = lastName.trim();

        String pigFirst = firstName.substring(1, 2).toUpperCase() + firstName.substring(2) + firstName.charAt(0) + "ay";
        String pigLast = lastName.substring(1, 2).toUpperCase() + lastName.substring(2) + lastName.charAt(0) + "ay";
        System.out.printf("%s %s",pigFirst, pigLast);



    }

}
