// Area of circle A = pi*r^2

import java.util.Scanner;

public class area_of_circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14, r=0;
        System.out.print("Enter the radius : ");
        r = input.nextDouble();
        System.out.println("The area of the circle : "+(pi*r*r));
    }
}