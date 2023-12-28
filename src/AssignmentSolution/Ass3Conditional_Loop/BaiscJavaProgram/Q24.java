package Ass3Conditional_Loop.BaiscJavaProgram;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop
public class Q24 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=1 ;
        int sum=0;

        while(n>0){

            System.out.println("Enter the number's two sum of it ,And enter 0 to end the loop.");
            n=sc.nextInt();
            sum =sum+n;

        }
        System.out.println(sum);

    }
}
