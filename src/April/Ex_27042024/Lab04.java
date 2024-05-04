package Ex_27042024;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //Factorial concept is 2! 2*1
        //                     3! 3*2*1
        //           n(n-1)(n-1)
       int num=6;

       long mult=1;
//       for(int i=1; i<=num; i++){
//           mult=mult*i;
//       } System.out.println(mult);
//       int i=1;
//       do{
//           mult=mult*i;
//           i++;
//       }while(i<=num);
//        System.out.println(mult);
        int i=1;
        while(i<=num){
            mult=mult*i;
            i++;
        }
        System.out.println(mult);
    }
}
