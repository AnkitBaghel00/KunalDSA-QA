package Assignment2;

//To calculate Fibonacci Series up to n numbers.
public class Q7 {
    public static void main(String[] args) {
        int n= 10;
        int firstTerm = 0;
        int secondTerm=1;

        for (int i=0;i<n;i++){
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm=nextTerm;

        }
    }
}
