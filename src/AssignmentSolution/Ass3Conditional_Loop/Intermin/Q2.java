package Ass3Conditional_Loop.Intermin;


import java.util.Scanner;

//Calculate Electricity Bill
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units :");
        int units = sc.nextInt();
        
        double billToPay=0;

        if(units<100){
            billToPay =units*1.20;
        }
        else if(units <300){
            billToPay = 100 * 1.20 + (units -100) *2;
        }
        else if(units >300){
            billToPay = 100*1.20 + 200*2 + (units - 300)*3;
        }
        else{
            System.out.println("For this level program is not made!!!");
        }
        System.out.println("The electricity bill for "+units+ "is :"+billToPay);
    }
}
