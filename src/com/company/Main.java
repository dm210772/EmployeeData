package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String employName = input.next();

        System.out.println("How many hours have you worked this week?");
        int employHours = input.nextInt();

        System.out.println("What is your hourly wage?");
        double employWage = input.nextDouble();

        double totalPay = employWage * employHours;

        if (employHours > 45) {
            int overHours = employHours - 45;
            double overBonus = employWage * 1.5;
            double totalOvertime = overHours * overBonus;

            totalPay = totalPay + totalOvertime;
        }

        double afterTax = totalPay * 0.80;

        System.out.println(employName + " will get " + employHours + " hours worth of pay.");
        System.out.println("Before tax: " + totalPay);
        System.out.print("After tax: " + afterTax);
    }
}
