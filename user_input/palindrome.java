// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String letter = input.nextLine();
        String rev_letter = "";
        for(int i=((letter.length())-1);i>=0;--i){
            rev_letter = rev_letter+letter.charAt(i);
        }
        if(letter.toLowerCase().equals(rev_letter.toLowerCase())){
            System.out.println("The given String "+letter+" is Palindrome");
        }
        else{
            System.out.println("The given String "+letter+" is not Palindrome");
        }
        input.close();
    }
}