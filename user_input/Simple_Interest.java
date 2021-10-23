// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the followint find the Simple Interest");
        System.out.print("Principal : ");
        double p = input.nextDouble();
        System.out.print("Time in years : ");
        double t = input.nextDouble();
        System.out.print("Rate : ");
        double r = input.nextDouble();
        double simple_interest = p*r*t/100;
        System.out.println("The Simple Interest is "+simple_interest+"rs");
    }
}