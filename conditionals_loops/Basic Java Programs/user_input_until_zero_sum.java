// 24. Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class user_input_until_zero_sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int sum = 0, n=-999;
            System.out.println("Enter 0 to cancel the input \nEnter number : ");
            while(n!=0){
                n = in.nextInt();
                sum +=n;
            }
            System.out.println("The sum of all entered numbers : "+sum);
            in.close();
    }
}