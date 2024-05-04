package Ex_23042024;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        //input is int
        //num < 0 is negative and num==0 and num>0
        System.out.print("Enter the number = ");
        Scanner user=new Scanner(System.in);
        int number=user.nextInt();
        if (number>0){
            System.out.println("Positive");
        }else if (number==0){
            System.out.println("Zero");
        }else {
            System.out.println("Negative");
        }
        user.close();
    }
}
