package Assignment2;

import java.util.Scanner;

//Input currency in rupees and output in USD
public class Q6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        float rupees;
        System.out.println("Enter rupees :");
        rupees=sc.nextFloat();

        double dollars = rupees/(83.34);
        System.out.println("Rupees to Dollars :"+dollars);

    }
}
