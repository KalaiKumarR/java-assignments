// 25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class user_input_until_zero_greater{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int greater = 0, n = -999;
        System.out.println("Enter 0 to cancel the input \nEnter number : ");
        while(n!=0){
            n = in.nextInt();
            if(n>greater){
                greater = n;
            }
        }
        System.out.print("The greater of entered value : "+greater);
        in.close();
    }
}