// Area of rhombus A = (d1*d2)/2

import java.util.Scanner;

public class area_of_rhombus{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double d1 = 0, d2 = 0;
        System.out.print("Enter 1st diagonal : ");
        d1 = in.nextDouble();
        System.out.print("Enter 2nd diagonal : ");
        d2 = in.nextDouble();
        System.out.println("The Area of rhombus : "+((d1*d2)/2));
        in.close();
    }
}