// 22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

import java.util.Scanner;

public class sub_pro_and_sum_digits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0, product = 1, rem=0;
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        while(n!=0){
            rem = n%10;
            sum +=rem;
            product *= rem;
            n = n/10;
        }
        System.out.println("Sum : "+sum+" Product : "+product);
        System.out.println("Answer : "+(product - sum));
        in.close();
    }
}