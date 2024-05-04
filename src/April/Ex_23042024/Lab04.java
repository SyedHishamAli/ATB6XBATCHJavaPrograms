package Ex_23042024;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        /*
        Even or Odd
        if num%2==0 then it is even number
        Taking a input from user Scanner class
        */
        System.out.printf("Enter the number = ");
        Scanner us=new Scanner(System.in);
        int i=us.nextInt();
            if(i%2==0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }

    }
}
