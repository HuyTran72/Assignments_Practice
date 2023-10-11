package operation_3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input the average score: ");
        float score = sc2.nextFloat();

        String anwser = (score >= 8 && score <= 10)? "Exellent" : ((score >= 6.5 && score < 8)? "Good":
                ((score >= 5 && score <6.5)? "OK" : ((score < 5 && score >=0)? "Bad" :
                "No exist, please input from 0 to 10")));
        
        System.out.println("Your result is " + anwser);
    }
}
