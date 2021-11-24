// 19. Curved Surface Area Of Cylinder (A = 2πrh)

import java.util.Scanner;

public class area_of_cylinder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius : ");
        double r = in.nextDouble();
        System.out.print("Enter height : ");
        double h = in.nextDouble();
        System.out.print("Area of Cylinder : "+(2*pi*r*h));
        in.close();
    }
}