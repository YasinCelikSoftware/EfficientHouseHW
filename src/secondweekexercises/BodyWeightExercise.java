package secondweekexercises;

import java.util.Scanner;

public class BodyWeightExercise {
    public static void main(String[] args) {

        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the body ft : ");
        int bodyFt = kb.nextInt();
        System.out.print("Please enter the additional inch : ");
        int additionalInch = kb.nextInt();
        int poundForFeet = 22;
        int poundForAdditionalInch = 5;
        int idealBodyWeigth = bodyFt*poundForFeet + additionalInch*poundForAdditionalInch;

        System.out.printf("Ideal body weigth for a person that has %d feet and %d additional inch(s) is : %d pounds."
                ,bodyFt,additionalInch,idealBodyWeigth);

    }
}
