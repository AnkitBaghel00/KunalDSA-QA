package Ass3Conditional_Loop.Intermin;


//Sum Of A Digits Of Number
public class Q24SumDigitsOfNumber {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;

        while(n>0){

            sum = sum+ n%10;
            n = n/10;
        }

        System.out.println(sum);
    }
}
