package Ass3Conditional_Loop.BaiscJavaProgram;

import java.util.Scanner;

//Area Of Circle Java Program
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int radius;
        double pi =3.142,area;

        System.out.println("Enter the radius of circle :");
        radius=sc.nextInt();

        area = pi*radius*radius;
        System.out.println("Area of circle is :"+area);

    }
}
