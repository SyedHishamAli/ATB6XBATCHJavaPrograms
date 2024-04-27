package Ex_23042024;

import java.util.Scanner;

public class HomeWork9 {
    //Leap Year
    //Core Logic as year divisible by 4, not by 100 but by 400
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        double year = sc.nextDouble();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}