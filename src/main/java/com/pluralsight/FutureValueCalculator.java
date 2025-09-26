package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    /** Calculator 2: A calculator that determines the future value of a
     one-time deposit assuming compound interest - it is used to help
     you decide how much a CD will be worth when it matures

     a. It would accept the deposit, interest rate, and number of
     years from the user

     b. It would display the future value and the total interest
     earned
     Example: If you deposit $1,000 in a CD that earns 1.75%
     interest and matures in 5 years, your CD's ending balance will
     be $ 1,091.44 and you would have earned $91.44 in interest

     Note: The numbers above assume daily compounding
     FV = P × (1 + (r / 365) )^(365 × t)

     • Future Value (FV) = Principal (P): This is the initial deposit amount.

     Annual Interest Rate (r): The nominal annual interest rate in decimal form.
     (e.g., 1.75% = 0.0175).

     Number of Years (t): The total number of years the deposit will earn interest.

     Days Per Year: Daily compounding assumes 365 days per year.


     Total Number of Days: This is 365 × t (because there are 365 days per year).

     Total Interest Earned = FV - P
     */
    // start of futureValueCalculator method
    public static void futureValueCalculator(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Thank you. Please enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Last, enter amount of years:  ");
        int numberOfYears = input.nextInt();

        /** FV = P × (1 + (r / 365) )^(365 × t)
         * FV = future value
         * P = initial deposit amount
         * r = annual interest rate
         * t = total number of years the deposit will earn interest
         */

        double interestRateDecimal = annualInterestRate / 100;

        double futureValue = depositAmount * Math.pow (1 +(interestRateDecimal / 365) ,365 * numberOfYears);

        double totalInterestEarned = futureValue - depositAmount;

        System.out.printf("The future value would be: $%.2f%n", futureValue);
        System.out.printf("Interest earned: $%.2f%n", totalInterestEarned);
    }
}
