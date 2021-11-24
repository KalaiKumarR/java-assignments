// 15. Armstrong Number In Java

import java.util.Scanner;

public class armstrong_number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0, sum = 0, rem = 0,temp = 0,its_power = 1;
        System.out.print("Enter Number : ");
        int n = in.nextInt();
        temp = n;
        while(temp != 0){
            temp /=10;
            count++;
        }
        temp = n;
        while(temp != 0){
            rem= temp% 10;
            for (int i=1; i<=count; i++){
                its_power *= rem;
                System.out.println("its_power :"+its_power);
            }
            System.out.println("its_powers :"+its_power);
            sum +=its_power;
            its_power = 1;
            temp /= 10;
        }
        System.out.println("sum : "+sum+" count"+count);
        if(sum == n){
            System.out.println("The number "+n+" is amstrong");
        }
        else{
            System.out.println("The number "+n+" is not amstrong");
        }
        in.close();
    }
}