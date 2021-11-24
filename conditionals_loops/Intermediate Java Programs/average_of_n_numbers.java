// 3. Calculate Average Of N Numbers

import java.util.Scanner;

public class average_of_n_numbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=-1, sum=0, count=-1;
        System.out.println("Enter 0 to terminate \nEnter number : ");
        while(n!= 0){
            n = in.nextInt();
            sum += n;
            count++;
        }
        System.out.println("Average : "+(sum/count));
        in.close();
    }
}