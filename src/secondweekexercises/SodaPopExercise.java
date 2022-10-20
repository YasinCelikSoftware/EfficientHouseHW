package secondweekexercises;

import java.util.Scanner;

public class SodaPopExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);

        double artificialSweetenerPerSoda = 0.001;
        double killBoundary = 0.07;

        System.out.print("Please enter the weight of dieter : ");
        int weightOfDieter = kb.nextInt();
        System.out.print("Please enter the desired weight of dieter : ");
        int desiredWeightOfDieter = kb.nextInt();
        int sodaNeedPerPound = 5;
        int poundsShouldLose = weightOfDieter - desiredWeightOfDieter;
        int needToDrinkSoda = poundsShouldLose * sodaNeedPerPound;
        double drinkableSoda = killBoundary/artificialSweetenerPerSoda;

        System.out.printf("You should drink %d sodas for lose %d pounds but you can drink only %.0f sodas. Be careful!"
                ,needToDrinkSoda,poundsShouldLose,drinkableSoda);

    }

}
