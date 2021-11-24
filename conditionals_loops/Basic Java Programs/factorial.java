// 1. Factorial Program In Java

import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter number : ");
        int n = in.nextInt();
        for(int i=n;i!=0; i--){
            fact *= i;
        }
        System.out.println("Factorial : "+fact);
        in.close();
    }
}