package Assignment2;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user
public class Q1 {
    public static void main(String[] args) {
        int userNum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value to check whether a number is even or odd : ");
        userNum = sc.nextInt();

        if(userNum %2 ==0){
            System.out.println(userNum+" is even");
        }else{
            System.out.println(userNum+" is odd");
        }


    }
}
