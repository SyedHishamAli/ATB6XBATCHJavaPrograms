package Ex_23042024;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Triangle checker
        //Equilateral, Isosceles, Scalene.
        //Core Logic for EQ all sides equal, Iso 2 sides equal, no sides equal.
        Scanner user=new Scanner(System.in);
        System.out.print("Enter the side1: ");
        int side1=user.nextInt();
        System.out.print("Enter the side2: ");
        int side2=user.nextInt();
        System.out.print("Enter the side3: ");
        int side3=user.nextInt();
        if (side1==side2 && side3==side2){
            System.out.println("This is Equilateral Triangle");
        } else if (side1==side2 || side2==side3 || side1==side3){
            System.out.println("This is Isosceles Triangle");
        }else {
            System.out.println("This Scalene Triangle");
        }
    }
}
