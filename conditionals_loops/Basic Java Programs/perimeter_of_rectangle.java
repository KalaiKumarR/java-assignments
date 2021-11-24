// Perimeter Of Rectangle (P=2(l+w))

import java.util.Scanner;

public class perimeter_of_rectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length : ");
        double l = input.nextDouble();
        System.out.print("Enter width : ");
        double w = input.nextDouble();
        System.out.print("The Perimeter of Rectange : "+(2*(l+w)));
        input.close();
    }
}