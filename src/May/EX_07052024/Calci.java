package May.EX_07052024;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What Mathematical operation you want *, + , - , /");
        int result=sum(23,45);
        System.out.println(result);
        int result1=mul(78,54);
        System.out.println(result1);
        int result2=sub(7845,845);
        System.out.println(result2);
        int result3=div(2689,58);
        System.out.println(result3);
        }

    static int sum(int num1, int num2){
        return num1+num2;
    }
    static int sub(int num1, int num2){
        return num1-num2;
    }
    static int mul(int num1, int num2){
        return num1*num2;
    }
    static int div(int num1, int num2){
        return num1/num2;
    }
}
