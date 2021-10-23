// 1. Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
public class oddeven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if((n%2) == 0)
            System.out.println("The number "+n+" is even");
        else
            System.out.println("The number "+n+" is odd");
    }
}