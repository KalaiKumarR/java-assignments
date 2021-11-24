// Area of rectangle A = w*l

import java.util.Scanner;

public class area_of_rectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double length = 0, width = 0;
        System.out.print("Length : ");
        length = input.nextDouble();
        System.out.print("Width : ");
        width = input.nextDouble();
        System.out.println("Area of rectangle : "+(length*width));
    }
}