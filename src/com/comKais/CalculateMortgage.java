package com.comKais;
public class CalculateMortgage {
    private final double MONTHS_IN_YEAR = 12;
    private double principal;
    private double annualInterestYear;
    private int year;
    private double monthlyInterest;
    private double numberOfPayments;
    private short month;
    private final Output out = new Output();

    //Main which take values from input
    public CalculateMortgage(double principal, double annualInterestYear, int year) {
        setPrincipal(principal);
        setYear(year);
        setAnnualInterestYear(annualInterestYear);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        Mortgage();//Mortgage
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (month = 1; month <= year * MONTHS_IN_YEAR; month++) {
            Balance();//balance
        }
    }

    //Setters
    private void setPrincipal(double principal) {
        this.principal = principal;
    }

    private void setAnnualInterestYear(double annualInterestYear) {
        this.annualInterestYear = annualInterestYear;
    }

    private void setYear(int year) {
        this.year = year;
    }

    //calculate similar values for Mortgage and balance
    private void calculateSimilar() {
        double PERCENT = 100;
        this.monthlyInterest = this.annualInterestYear / PERCENT / this.MONTHS_IN_YEAR;
        this.numberOfPayments = (double) this.year * this.MONTHS_IN_YEAR;
    }

    //Mortgage
    private void Mortgage() {
        calculateSimilar();
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
       out.output(mortgage);

    }

    //balance
    private void Balance() {
        calculateSimilar();
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPayments-month))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        out.output(balance);
    }


}
