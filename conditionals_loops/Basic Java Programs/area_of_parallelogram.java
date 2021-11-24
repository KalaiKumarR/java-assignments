// Area of parallelogram A = b*h

import java.util.Scanner;

public class area_of_parallelogram{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double b = 0, h = 0;
        System.out.print("Enter base : ");
        b = input.nextDouble();
        System.out.print("Enter the height : ");
        h = input.nextDouble();
        System.out.println("The Area of Parallelogram : "+(b*h));
        input.close();
    }
}