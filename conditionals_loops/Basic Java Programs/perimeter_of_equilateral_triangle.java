// 9. Perimeter Of Equilateral Triangle (P=3s)

import java.util.Scanner;

public class perimeter_of_equilateral_triangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Side of the triangle : ");
        double s = in.nextDouble();
        System.out.println("Perumeter of Eqrilateral Triangle : " + (3*s));
    }
}