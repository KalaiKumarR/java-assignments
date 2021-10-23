// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci_series{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temp1=0, temp2 = 1 , sum = 0;
        System.out.print("Enter a number(n) to print the fibanacci Series form 1 to n :");
        int n = input.nextInt();
        System.out.print(temp1+" "+temp2+" ");
        for(int i=2;i<n;i++){
            sum = temp1+temp2;
            System.out.print(sum+" ");
            temp1 = temp2;
            temp2 = sum;
        }      
    }
}