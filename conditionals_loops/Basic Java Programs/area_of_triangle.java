// Area of triangle A = h*b/2

import java.util.Scanner;

public class area_of_triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double h = 0, b = 0;
        System.out.print("Enter Height : ");
        h = input.nextDouble();
        System.out.print("Enter Base : ");
        b = input.nextDouble();
        System.out.println("Area of Triangle : "+(h*b)/2);
    }
}