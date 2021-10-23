// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

import java.util.Scanner;

public class math{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double n2 = input.nextDouble();
        System.out.print("Enter any symbol (+,-,*,/) : ");
        String task = input.next();
        if(task.equals("+")){
            System.out.println(n1+n2);
        }
        else if(task.equals("-")){
            System.out.println(n1-n2);
        }
        else if(task.equals("*")){
            System.out.println(n1*n2);
        }
        else if(task.equals("/")){
            System.out.println(n1/n2);
        }
        else{
            System.out.println("Enter a valid symbol");
        }
    }
}