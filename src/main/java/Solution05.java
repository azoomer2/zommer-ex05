/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Zommer
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String in1 = scan.nextLine();
        System.out.print("What is the second number? ");
        String in2 = scan.nextLine();
        int num1 = Integer.parseInt(in1);
        int num2 = Integer.parseInt(in2);
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1*num2;
        int quotient = num1/num2;
        System.out.println(num1+" + "+num2+" = "+sum+"\n"+num1+" - "+num2+" = "+diff+"\n"
                +num1+" * "+num2+" = "+product+"\n"+num1+" / "+num2+" = "+quotient+"\n");
    }
}

/* Pseudo Code

    System.out prompt user for 'num1'
    System.in 'in2'
    System.out prompt user for 'num2'
    System.in 'in2'
    parse in1 to num1
    parse in2 to num2
    sum = num1 + num2
    diff = num1 - num2
    product = num1 * num2
    quotient = num1 / num2
    System.out results with formatting

 */