package secondweekexercises;

import java.util.Scanner;

public class ReplaceExercise {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the message that to be changed : ");
        String toBeChangedMessage = kb.nextLine();

        System.out.print("Please enter the word you want to change : ");
        String existingWord = kb.nextLine();

        System.out.print("Please enter the \"?\" (" + existingWord + " to ?) : ");
        String replaceWord = kb.nextLine();

        String rephrasedMessage = toBeChangedMessage.replace(existingWord, replaceWord);
        System.out.println(rephrasedMessage);

    }
}
