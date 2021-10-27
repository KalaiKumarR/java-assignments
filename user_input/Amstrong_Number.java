import java.util.Scanner;
import java.lang.Math;

public class Amstrong_Number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int user_num, temp_num, digits = 0, digit_pow_sum = 0, pow = 1 ,rem;
        System.out.print("Enter a number : ");
        user_num = input.nextInt();
        temp_num = user_num;
        //Find the total number of digits in a number
        while(temp_num > 0){
            digits++;
            temp_num = temp_num/10;
        }
        System.out.println("Total number of digits : "+digits);
        //Finding the wheather it is amstrong or not
        temp_num = user_num;
        while(temp_num>0){
            rem = temp_num%10;
            //digit_pow_sum += (Math.pow(rem,digits));
            for(int i=1;i<=digits; i++){
                pow *= rem;
            }
            digit_pow_sum += pow;
            temp_num = temp_num/10;
            pow = 1;
        }
        if(digit_pow_sum == user_num){
            System.out.println("The number "+user_num+" is amstrong");
        }
        else{
            System.out.println("The number "+user_num+" is not amstrong");
        }
    }
}