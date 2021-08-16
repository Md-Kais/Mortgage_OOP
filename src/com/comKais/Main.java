package com.comKais;
public class Main {
//refactoring video 4 is important for safe refactoring
    public static void main(String[] args) {
        final double principalMin = 1000;
        final double getPrincipalMax = 1_000_000;
        final double annualInterestRateMin = 0.00001;
        final double annualInterestRateMax = 100;
        final double yearsMin = 1;
        final double yearsMax = 100;
        var input=new Input();
        double principal=input.readInput("Principal",principalMin,getPrincipalMax);
        double annualInterest=input.readInput("Annual Interest",annualInterestRateMin,annualInterestRateMax);
        int year=(int)input.readInput("Period(Year)",yearsMin,yearsMax);
        CalculateMortgage calculateMortgage =new CalculateMortgage(principal,annualInterest,year);
        System.out.println(calculateMortgage);
    }
}
