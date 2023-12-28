package Assignment2;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number :");
        a=sc.nextInt();
        b=sc.nextInt();

        if(a>b){
            System.out.println("A greater then B");
        }
        else {
            System.out.println("B greater then A");
        }
    }
}
