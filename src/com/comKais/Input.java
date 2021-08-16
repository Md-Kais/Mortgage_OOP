package com.comKais;


import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public double readInput(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println(prompt + "should be " + min + " to " + max);
        }
        return value;
    }
}
