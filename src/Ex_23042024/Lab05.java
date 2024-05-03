package Ex_23042024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //Three Steps to crack any programming question
        //1. Find the user inputs
        //Data type in input and output data type
        //2. Basic Logic
        Scanner us=new Scanner(System.in);
        System.out.print("Enter your score here = ");
        float Score=us.nextFloat();
        char grade='F';
        if(100>=Score && Score>=90){
            grade='A';
        }else if(90>Score && Score>=80){
            grade='B';
        } else if (80>Score && Score>=70) {
            grade ='C';
        } else if (70>Score && Score>=60) {
            grade='D';
        } else if (60>Score && Score>=40) {
            grade='E';
        } else if (Score>100) {
            System.out.println("Invalid score");
        } else grade = 'F';
        System.out.println("Your Grade is --> " +grade);
        us.close();
    }
}
