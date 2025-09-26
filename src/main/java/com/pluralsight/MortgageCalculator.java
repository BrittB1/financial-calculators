package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

// define our scanner object since we need user import
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble(); //Principal (p)

        System.out.print("Thank you,enter Annual Interest Amount: ");
        double annualInterestRate = input.nextDouble() / 100; //interest rate (r)

        System.out.print("Last, enter loan length (in years): "); //
        int loanLength = input.nextInt(); //loan length in years (y)

        /* Mortgage calculation formula: M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
         * M = Monthly payment
         * P = Principal loan amount
         * i = monthly interest rate
         * n = total number of payments
         */
        int numberOfMonthlyPayments = 12 * loanLength; // Number of Monthly Payments (n)

        double monthlyInterestRate = annualInterestRate / 12; // Monthly interest Rate (i)

        // M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        double monthlyPayment = loanAmount *  (monthlyInterestRate * Math.pow(1 + monthlyInterestRate , numberOfMonthlyPayments)/(Math.pow(1 + monthlyInterestRate , numberOfMonthlyPayments) - 1));

        double totalInterest = (monthlyPayment* numberOfMonthlyPayments) - loanAmount;

        System.out.printf("Monthly Payment $%.2f, Total Interest: $%.2f", monthlyPayment, totalInterest);

    }
}
