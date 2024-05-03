package Ex_23042024;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean Isleapyr= false;
        if(year%4==0 && year%100!=0 || year%400==0){
            Isleapyr=true;
        }
        if(Isleapyr){
            System.out.println(year+" this is a Leap Year");
        }else{
            System.out.println(year+" is not a Leap Year");
        }
    }
}
