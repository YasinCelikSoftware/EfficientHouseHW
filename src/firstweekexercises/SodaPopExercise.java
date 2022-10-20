package firstweekexercises;

public class SodaPopExercise {
    public static void main(String[] args) {

        double artificialSweetenerPerSoda = 0.001;
        double killBoundary = 0.07;
        int weightOfDieter = 110;
        int desiredWeightOfDieter = 95;
        int sodaNeedPerPound = 5;
        int poundsShouldLose = weightOfDieter - desiredWeightOfDieter;
        int needToDrinkSoda = poundsShouldLose * sodaNeedPerPound;
        double drinkableSoda = killBoundary / artificialSweetenerPerSoda;

        System.out.printf("You should drink %d sodas for lose %d pounds but you can drink only %.0f sodas. Be careful!"
                , needToDrinkSoda, poundsShouldLose, drinkableSoda);

    }
}
