package Ex_23042024;

import java.util.Scanner;

public class FizzBuzz {
    //Input -->int
    //Core logic is remainder 0 for both 3 5.
    public static void main(String[] args) {
        System.out.println("Please enter the number between 1-100");
        Scanner us = new Scanner(System.in);
        int num = us.nextInt();

        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz " + num);
        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz " + num);
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz " + num);
        } else {
            System.out.println();
        }
    }
}
