// 2. Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class greeting_message{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ener Your Name : ");
        String Name = input.nextLine();
        System.out.println("Welcome "+Name+":)");
    }
}