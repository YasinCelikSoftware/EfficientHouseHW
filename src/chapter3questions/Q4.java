package chapter3questions;

public class Q4 {
    public static void main(String[] args) {
        inflationCalculator();
    }

    public static void inflationCalculator(){

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter the item cost : ");
        double itemCost = kb.nextDouble();

        System.out.print("Please enter how many years later you will buy it : ");
        int year = kb.nextInt();

        System.out.print("Please enter the inflation rate : ");
        double inflationRate = kb.nextDouble() / 100;

        display(year,inflationRate,calculateItemCost(year, itemCost, inflationRate));

    }

    public static double calculateItemCost(int year, double itemCost, double inflationRate){
        for(int i = 0; i < year; i++){
            itemCost += itemCost * inflationRate;
        }
        return itemCost;
    }

    public static void display(int year, double inflationRate, double price){

        System.out.printf("%nThe price of the item after %d years with %.2f inflation rate : %.2f", year, inflationRate, price);

    }
}
