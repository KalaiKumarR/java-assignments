// 13. Perimeter Of Rhombus (P=4s)

import java.util.Scanner;

public class perimeter_of_rhombus{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = in.nextDouble();
        System.out.println("The Rerimeter of Rhombus : "+(4*s));
        in.close();
    }
}