// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered 
// by the user.

import java.util.Scanner;

public class max_min_numbers{
    static int max(int a,int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b<a){
            return b;
        }
        else{
            return c;
        }
    }
    static int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<c && a<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println("Max :"+(max(n1,n2,n3)));
        System.out.println("Min :"+(min(n1,n2,n3)));
        in.close();
    }
}