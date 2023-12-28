package Ass3Conditional_Loop.Intermin;

import java.util.Scanner;


//Find if a number is palindrome or not
public class Q17{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,c,r,s=0;
        System.out.println("Enter number :");
        n = sc.nextInt();
        c=n;

        while(n>0){

            r = n%10;
            s =(s*10)+r;
            n = n/10;
        }
        if(c == s){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }
}