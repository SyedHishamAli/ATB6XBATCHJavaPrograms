package Ex_23042024;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args)
    {
        System.out.println("Enter any integer");
        Scanner us=new Scanner(System.in);
        int num=us.nextInt();


        if(num%2==0 && num==2){
            System.out.println(num+" is a prime number");
        } else if (num==1) {
            System.out.println(num+ " is not a prime number");
        } else if (num%2!=0 && num>2) {
            System.out.println(num+" is a prime number");


        }
    }
}

