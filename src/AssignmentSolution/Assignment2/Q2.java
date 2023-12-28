package Assignment2;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String userName =sc.next();

        System.out.println("Your name is "+userName);

    }
}
