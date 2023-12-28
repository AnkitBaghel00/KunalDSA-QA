package Ass3Conditional_Loop.Intermin;


//Reverse A String In Java
public class Q16 {
    public static void main(String[] args) {
        String str = "Ankit";
        String temp="";
        char ch;

        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            temp =ch+temp;

        }
        System.out.println(temp);

    }
}
