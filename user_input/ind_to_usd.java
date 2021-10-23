// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class ind_to_usd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inr(rs) amount : ");
        double inr = input.nextDouble();
        double usd = inr*0.013;
        System.out.printf("The equal value in usd($) : %.2f",usd);
        input.close();
    }
}