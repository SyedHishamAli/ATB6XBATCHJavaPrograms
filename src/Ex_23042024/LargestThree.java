package Ex_23042024;

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        System.out.println("Enter your number here --> ");
        Scanner u=new Scanner(System.in);
        int num1=u.nextInt();
        int num2=u.nextInt();
        int num3=u.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("This "+num1+" is largest among three");
        }else if (num2>num1 && num2>num3) {
            System.out.println("This "+num2+" is largest number among three");
        }else{
            System.out.println("This "+num3+" is largest number among three");
        }
    }
}
