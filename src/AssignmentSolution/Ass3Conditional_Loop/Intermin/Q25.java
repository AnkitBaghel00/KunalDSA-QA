package Ass3Conditional_Loop.Intermin;



//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August
public class Q25 {
    public static void main(String[] args) {
        int month = 31;
        int evenDay=0;

        for(int i=1;i<=month;i++){
            if(i % 2 == 0){
                evenDay++;
            }
        }
        System.out.println("Numbers of days in August kunal play outdoor "+evenDay);
    }

}



