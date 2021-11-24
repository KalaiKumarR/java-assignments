// 14. Volume Of Cone Java Program (V=π(r^2)(h/3))

import java.util.Scanner;

public class volume_of_cone{
    public static void main(String[] args){
        double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = in.nextDouble();
        System.out.print("Enter height : ");
        double h = in.nextDouble();
        // System.out.print(String.format("%.2f", floatValue));
        System.out.println("Volumn of cone : "+(pi*(r*r)*(h/3)));
        in.close();
        }
}