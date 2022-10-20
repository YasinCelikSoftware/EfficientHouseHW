package secondweekexercises;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence without white spaces : ");
        String sentence = scanner.next();
        System.out.println("Our sentence is = " + sentence + "\n" + "-----------------------------");
        System.out.print("Please enter the value of how many letter should be in a part : ");
        int parts = scanner.nextInt();
        compareMethod2(sentence, parts);


    }

    public static void compareMethod(String s, int k) {

        String[] spell = new String[s.length()];
        int i = 0;

        for (k = s.length(); k >= 0; k--) {

            spell[i] = s.substring(k - 3, k);
            i++;
            if (k == 3) {

                break;

            }

        }

        String min = spell[0];
        String max = spell[0];
        for (int j = 0; j < i; j++) {

            if (min.compareTo(spell[j]) > 0) {

                min = spell[j];

            }
            if (max.compareTo(spell[j]) < 0) {

                max = spell[j];

            }

        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void compareMethod2(String s, int k) {

        String max = s.substring(0, k); // welcometojava --> wel
        String min = s.substring(0, k); // welcometojava --> wel


        for(int i=1; i<=s.length()-k; i++) {


            String s2 = s.substring(i, i+k);

            if(max.compareTo(s2)<0) {

                max = s2;

            }

            if(min.compareTo(s2)>0) {

                min = s2;

            }
        }

        System.out.println("Our max value spell is : " + max);
        System.out.println("Our min value spell is : " + min);

    }
}
