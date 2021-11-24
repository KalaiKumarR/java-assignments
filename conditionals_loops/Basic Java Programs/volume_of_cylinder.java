// 16. Volume Of Cylinder (V=π(r^2)h)

import java.util.Scanner;

public class volume_of_cylinder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius : ");
        double r = in.nextDouble();
        System.out.print("Enter height : ");
        double h = in.nextDouble();
        System.out.print("Volumn of Cylinder : "+(pi*(r*r)*h));
        in.close();
    }
}