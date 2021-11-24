// 12. Perimeter Of Square (P=4s)

import java.util.Scanner;

public class perimeter_of_square{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        double s = in.nextDouble();
        System.out.println("The perimeter of square : "+(4*s));
        in.close();
    }
}