package com.pluralsight.financialcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal:");
        int principal = scanner.nextInt();

        System.out.println("Enter the interest rate:");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter the loan length:");
        int loanLength = scanner.nextInt() * 12;


        MortgageCalculator calculator =
                new MortgageCalculator(principal, interestRate, loanLength);

        System.out.printf("Your monthly payment is " + String.format("%.2f", calculator.monthlyPayment()));
        System.out.println(" ");
        System.out.printf("Your total interest paid is " + String.format("%.2f", calculator.totalInterestPaid(calculator.monthlyPayment())));





    }
}

//Mortgage Calculator:
//        Monthly Payment: monthlyPayment = (principal * interestRate * ((1 + interestRate)^months)) / (((1 + interestRate)^months) - 1)
//        Total Interest Paid: totalInterest = (monthlyPayment * months) - principal
//        Future Value Calculator:
//        Future Value: futureValue = deposit * (1 + interestRate)^years
//        Total Interest Earned: totalInterest = futureValue - deposit
//        Present Value Calculator:
//        Present Value: presentValue = monthlyPayout * ((1 - (1 + interestRate)^(-years*12)) / interestRate)