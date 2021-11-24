// 18. Volume Of Pyramid (V=lwh/3)9  

import java.util.Scanner;

public class volume_of_pyramid{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length : ");
        double l = in.nextDouble();
        System.out.print("Enter width : ");
        double w = in.nextDouble();
        System.out.print("Enter Height : ");
        double h = in.nextDouble();
        System.out.println("Volumn of Pyramid : "+(((l*w*h)/3)*9));
        in.close();
    }
}