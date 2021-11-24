// 15. Volume Of Prism (V=Bh)

import java.util.Scanner;

public class volume_of_prism{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Breath : ");
        double b = in.nextDouble();
        System.out.print("Height : ");
        double h = in.nextDouble();
        System.out.println("The Volumn of Prism : "+(b*h));
    }
}