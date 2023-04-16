package com.Learntocode;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FinancialCalculators {


public static void main(String[] args) {
   chooseCalculator();
   mortgageCalculator();
   futureCalculator();







}

public static void chooseCalculator() {
    Scanner input = new Scanner(System.in);

    System.out.println("Which Calculator Would You Like to Access? (A or B)");
    String whichCalculator = input.nextLine();


    if (whichCalculator.equalsIgnoreCase("a")) {
        System.out.println("Welcome to Our Mortgage Calculator ");


    } else {
        System.out.println("Welcome to Our Future Value Calculator ");
    }

}
    public static void mortgageCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Thank you for choosing Mortgage Calculator");
        System.out.println("Please Insert Principal Cost:");
        int principalCost = input.nextInt();


        System.out.println("Thank you, Now input your Interest Rate:");
        Float interestRate = input.nextFloat();


        System.out.println("Thank you, Lastly PLease Enter The Length of Your Loan(In years) :");
        Float loanLength = input.nextFloat();


        float monthlyPayment = (principalCost * interestRate * (float) Math.pow(1 + interestRate, loanLength))
                / ((float) Math.pow(1 + interestRate, loanLength) - 1);

        System.out.println(monthlyPayment + " Is Due Monthly.");
    }



    public static void futureCalculator(){





    }









}