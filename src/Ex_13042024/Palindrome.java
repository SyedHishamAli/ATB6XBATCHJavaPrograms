package Ex_13042024;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        String pa=st.toString();
        String sr=new String(pa);
        if(sr.length()==pa.length()){
            System.out.println("Is Palindrome");
        }
    }
}
