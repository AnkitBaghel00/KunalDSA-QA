package Ass3Conditional_Loop.Intermin;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int neg=0,posEve=0,posOdd=0;

        System.out.println("Enter number (enter 0 to stop) :");
        int n = sc.nextInt();
        for (int i = 1; i < n ; i++) {

            if(i == 0){
                break;
            }

            if(i<0){
                neg = neg+i;
            }
            if(i>0 && i%2 == 0){
                posEve = posEve+i;
            }
            if(i>0 && i%2 !=0){
                posOdd =posOdd+i;
            }
        }
        System.out.println("Even Number "+posEve);
        System.out.println("Odd Number "+posOdd);
        System.out.println("Negative Number "+neg);
    }
}
