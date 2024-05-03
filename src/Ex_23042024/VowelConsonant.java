package Ex_23042024;

import java.util.Scanner;

public class VowelConsonant {

    //input is Char output is String
    //Core Logic Vowels are a e i o u
    public static void main(String[] args) {
        System.out.print("Please enter the letter here --> ");
        Scanner u=new Scanner(System.in);
        char ch=u.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Letter is Vowel");
        }else{
            System.out.println("Letter is Consonant");
        }
    }
}
