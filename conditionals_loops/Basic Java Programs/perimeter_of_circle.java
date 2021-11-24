// 8. Perimeter Of Circle (C=2πr)

import java.util.Scanner;

public class perimeter_of_circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = input.nextDouble();
        System.out.println("Perimeter of Circle : "+(2*3.14*r));
        input.close();
    }
}