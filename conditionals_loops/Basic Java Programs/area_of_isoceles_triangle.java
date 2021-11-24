// Area of isoceles triangle = b*h/2

import java.util.Scanner;

public class area_of_isoceles_triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double b=0, h=0;
        System.out.print("Enter Base : ");
        b = input.nextDouble();
        System.out.print("Enter height : ");
        h = input.nextDouble();
        System.out.println("The area of isoceles triangle : "+(b*h/2));
        input.close();
    }
}