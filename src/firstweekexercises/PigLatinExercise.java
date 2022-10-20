package firstweekexercises;

public class PigLatinExercise {
    public static void main(String[] args) {
        String first = "yasin";
        String last = "celik";
        first = first.trim();
        last = last.trim();

        String pigFirst = first.substring(1, 2).toUpperCase() + first.substring(2) + first.charAt(0) + "ay";
        String pigLast = last.substring(1, 2).toUpperCase() + last.substring(2) + last.charAt(0) + "ay";
        System.out.printf("%s %s", pigFirst, pigLast);


    }

}
