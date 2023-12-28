package Ass3Conditional_Loop.BaiscJavaProgram;


import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class Q25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        int max = Integer.MIN_VALUE;
        int secmax = 0;

        do{
            System.out.println("Enter the number's for to find largest you enter ,And enter 0 to end the loop.");
            num = sc.nextInt();

            if (num > max && num > secmax) {
                secmax = num;
            }
        }while(num > 0);

        System.out.println("Largest number you enter in it :" +secmax);


    }
}
