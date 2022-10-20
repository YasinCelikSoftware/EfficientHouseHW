package firstweekexercises;

public class BodyWeightExercise {
    public static void main(String[] args) {

        int bodyFt = 6;
        int additionalInch = 3;
        int poundForFeet = 22;
        int poundForAdditionalInch = 5;
        int idealBodyWeigth = bodyFt*poundForFeet + additionalInch*poundForAdditionalInch;

        System.out.printf("Ideal body weigth for a person that has %d feet and %d additional inch(s) is : %d pounds."
                ,bodyFt,additionalInch,idealBodyWeigth);

    }
}
