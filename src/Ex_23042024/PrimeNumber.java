package Ex_23042024;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number to know --> ");
        int num = user.nextInt();
        if (num / 1 == num && num % num == 0) {
            if (num % (num/num) == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}