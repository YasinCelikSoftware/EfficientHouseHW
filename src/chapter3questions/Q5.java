package chapter3questions;

public class Q5 {
    public static void main(String[] args) {
        monthCalculator();
    }

    public static void monthCalculator(){

        double debt = 1000;
        double interestRate = 0.015;
        int monthCounter = 0;
        double totalInterestedPayment = 0;

        while(debt > 0){
            double monthlyPayment = 50;
            double interestedMonthlyDebt = debt * interestRate;

            totalInterestedPayment += interestedMonthlyDebt;

            if(debt<=49.261084)
                monthlyPayment = debt + interestedMonthlyDebt;

            monthlyPayment -= interestedMonthlyDebt;
            debt -= monthlyPayment;
            monthCounter++;
            System.out.println(debt);
        }

        System.out.printf("You've paid totally %.2f interest in %d months.%n",totalInterestedPayment,monthCounter);

    }
}
