package Ass3Conditional_Loop.BaiscJavaProgram;

import java.util.Scanner;

///Input a number and print all the factors of that number (use loops).
public class Q23 {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for factors");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }



    }
}
