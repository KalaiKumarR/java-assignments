// 10. Perimeter Of Parallelogram (P=2(s+b))

import java.util.Scanner;

public class perimeter_of_parallelogram{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = in.nextDouble();
        System.out.print("Enter the Base : ");
        double b = in.nextDouble();
        System.out.println("The Perimeter of Parallelogram : "+(2*(s+b)));
        in.close();
    }
}