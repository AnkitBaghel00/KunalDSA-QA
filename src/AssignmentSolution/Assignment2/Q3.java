package Assignment2;


import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
public class Q3 {
    public static void main(String[] args) {
        float p,t,r,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of principal : ");
        p =sc.nextFloat();
        System.out.println("Enter the values of time : ");
        t =sc.nextFloat();
        System.out.println("Enter the values of rate : ");
        r =sc.nextFloat();

        si =(p*t*r)/100;

        System.out.println("Simple interest is : "+si);




    }
}
