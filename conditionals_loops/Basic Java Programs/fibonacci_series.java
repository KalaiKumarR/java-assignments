// 21. Fibonacci Series In Java Programs

import java.util.Scanner;

public class fibonacci_series{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = 0 , n2 = 1,sum=0;
        System.out.print("Enter the end number : ");
        int end = in.nextInt();
        while(sum<=end){
            sum = n1+n2;
            if(sum>=end){break;}
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;
        }
        in.close();
    }
}