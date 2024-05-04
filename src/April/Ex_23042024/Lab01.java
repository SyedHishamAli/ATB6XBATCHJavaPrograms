package Ex_23042024;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        // age > 18 you can watch the movies
        // if (condition -> boolean true or false)//this is keyword
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        boolean IsEligible=false;
        if(age>18){
            IsEligible=true;
        }
        if(IsEligible){
            System.out.println("You can watch the movie");
        }
        else{
            System.out.println("You cannot watch the movie");
        }
    }

}
