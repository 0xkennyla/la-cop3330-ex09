/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = scan.nextInt();
        System.out.println("Enter width:");
        int w = scan.nextInt();
        int area = l * w;
        int gallon = 350;

        double x = (double)area/350;

        System.out.println("You will need to purchase " + Math.ceil(x) + " gallons of paint to cover "
                + area + " square feet.");
    }
}