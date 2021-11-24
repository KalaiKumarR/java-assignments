// 20. Total Surface Area Of Cube (A = 6(a^2)

import java.util.Scanner;

public class area_of_cube{
    public static void main(String[] args){
        Scanner in = new  Scanner(System.in);
        System.out.print("Enter side : ");
        int s = in.nextInt();
        System.out.println("Area of Cube : "+(6*(s*s)));
        in.close();
    }
}