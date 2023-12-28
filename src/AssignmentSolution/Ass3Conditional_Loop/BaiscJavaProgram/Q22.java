package Ass3Conditional_Loop.BaiscJavaProgram;

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
public class Q22 {
    public static void main(String[] args) {
        int n =234;
        int res = subtractProductAndSum(n);
        System.out.println(res);
    }


    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;

        while (n > 0) {
            sum = sum + (n % 10);
            multi = multi * (n % 10);

            n = n / 10;
        }
        return multi-sum;

    }
}




        //if the given value is in Array use this.
//        int n[] = {4,4,2,1};
//        int i=0;
//        int PoD=1;
//        int Sum=0;
//
//
//        while(i<=n.length-1){
//
//
//            PoD = PoD*n[i];
//            Sum = Sum+n[i];
//
//            i++;
//
//        }
//        int res = PoD-Sum;
//        System.out.println("Answer"+res);

