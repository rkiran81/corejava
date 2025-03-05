package com.corejava.example.datatypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

	public static void main(String[] args) {
		BigDecimal price = new BigDecimal("19.99");
        BigDecimal taxRate = new BigDecimal("0.08");
        BigDecimal tax = price.multiply(taxRate);
        BigDecimal totalPrice = price.add(tax);
        
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + totalPrice);
        
        /////////////////////////////////////////////////////
        
        BigDecimal revenue = new BigDecimal("1000000.00");
        BigDecimal expenses = new BigDecimal("750000.00");
        BigDecimal profit = revenue.subtract(expenses);
        
        System.out.println("Revenue: " + revenue);
        System.out.println("Expenses: " + expenses);
        System.out.println("Profit: " + profit);

        /////////////////////////////////////////////////////
        
        BigDecimal principal = new BigDecimal("500000.00");
        BigDecimal annualInterestRate = new BigDecimal("0.05");
        BigDecimal monthlyInterestRate = annualInterestRate.divide(new BigDecimal("12"), RoundingMode.HALF_UP);
        int termInMonths = 360;  // 30 years
        
        BigDecimal numerator = monthlyInterestRate.multiply((monthlyInterestRate.add(BigDecimal.ONE)).pow(termInMonths));
        BigDecimal denominator = (monthlyInterestRate.add(BigDecimal.ONE)).pow(termInMonths).subtract(BigDecimal.ONE);
        BigDecimal monthlyPayment = principal.multiply(numerator).divide(denominator, RoundingMode.HALF_UP);
        
        System.out.println("Monthly Payment: " + monthlyPayment);

        /////////////////////////////////////////////////////
        
        BigDecimal principal1 = new BigDecimal("10000.00");
        BigDecimal annualInterestRate1 = new BigDecimal("0.06");
        int years = 10;
        
        BigDecimal finalAmount = principal1.multiply((BigDecimal.ONE.add(annualInterestRate1)).pow(years));
        finalAmount = finalAmount.setScale(2, RoundingMode.HALF_UP);
        
        System.out.println("Initial Investment: " + principal1);
        System.out.println("Annual Interest Rate: " + annualInterestRate1);
        System.out.println("Years: " + years);
        System.out.println("Final Amount: " + finalAmount);
	}

}
