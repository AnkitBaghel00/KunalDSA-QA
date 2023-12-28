package Assignment2;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        char op;


        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Enter a operator among this(+, -, *, /) to calculate your value");

        op = sc.next().charAt(0);

        if(op == '+'){
            c =a+b;
            System.out.println("Your answer is : "+ c);
        }
        if(op == '-'){
            c =a-b;
            System.out.println("Your answer is : "+c);
        }
        if(op == '*'){
            c =a*b;
            System.out.println("Your answer is : "+c);
        }
        if(op == '/'){
            c =a/b;
            System.out.println("Your answer is : "+c);
        }
        else{
            System.out.println("Enter wrong operator");
        }

    }

}
