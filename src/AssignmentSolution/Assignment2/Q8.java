package Assignment2;

//To find out whether the given String is Palindrome or not.
public class Q8 {
    public static void main(String[] args) {

        String ex = "racecar";
        int i = 0;
        int j = ex.length() - 1;
        while (i < ex.length() & j >= 0) {
            if (i >= j) {
                System.out.println("String is Palindrome");
                return;
            } else if (ex.charAt(i) == ex.charAt(j)) {
                i++;
                j--;
            } else {
                System.out.println("String is not a Palindrome");
                return;
            }
        }
    }
}