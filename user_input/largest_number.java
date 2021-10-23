// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largest_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double n1 = input.nextDouble();
        System.out.print("Enter Second number : ");
        double n2 = input.nextDouble();
        double large = 0;
        if(n1>n2){
            large =n1;
        }
        else if(n2>n1){
            large = n2;
        }
        else{
            System.out.println("Both the number are same");
            large = n1;
        }
        System.out.println("The largest number is : "+large);
    }
}
