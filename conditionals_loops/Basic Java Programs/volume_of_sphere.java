// 17. Volume Of Sphere (V=(4/3)π(r^3))

import java.util.Scanner;

public class volume_of_sphere{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius : ");
        double r = in.nextDouble();
        System.out.print("Volumn of Sphere : "+((4/3)*pi*(r*r*r)));
        in.close();
    }
}