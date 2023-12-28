package Ass3Conditional_Loop.Intermin;


import java.util.Scanner;

//Calculate Average Of N Numbers
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        float sum =0;
        float averg=0,in=0;
        int count=1;

        while(count <=n){
            System.out.println("Enter the "+count+" number!");
            in = sc.nextInt();
            sum =sum+in;
            count++;
        }
        averg = sum/n;
        System.out.println("The average is "+averg);
    }
}
