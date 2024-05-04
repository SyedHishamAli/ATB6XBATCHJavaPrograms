package Ex_25042024;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //if is a condition
        // Switch statement which gives multiple condition
        //Switch for Operator
        //input type char return type int

        Scanner u=new Scanner(System.in);
        System.out.println("Select the operation you want to make --> +,-,*,/ ");
        char operator=u.next().charAt(0);
        System.out.println("Enter the first number");
        int num1=u.nextInt();
        System.out.println("Enter the second number");
        int num2=u.nextInt();
        switch (operator) {
            case '/' : System.out.println("Division "+num1/num2);break;
            case '*' : System.out.println("Multiplication "+num1*num2); break;
            case '-' : System.out.println("Substraction "+ (num1-num2));  break;
            case '+' : System.out.println("Addition "+ (num1+num2)); break;
            default:
                System.out.println("Invalid Operator");
        }



    }
}
