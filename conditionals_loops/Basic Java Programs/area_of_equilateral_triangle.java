// Area of equilateral triangle A = (√3)/4 × (side)^2

import java.util.Scanner;

public class area_of_equilateral_triangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = in.nextDouble();
        System.out.println("Area of equilateral triangle : "+((Math.sqrt(3)/4)*s*s));
    }
}