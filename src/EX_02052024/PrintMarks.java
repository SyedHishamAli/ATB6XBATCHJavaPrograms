package EX_02052024;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] Marks= new double[5];
        System.out.print("Enter the Marks of Eng --> ");
        Marks[0]=sc.nextDouble();
        System.out.print("Enter the Marks of Math --> ");
        Marks[1]=sc.nextDouble();
        System.out.print("Enter the Marks of Sci --> ");
        Marks[2]=sc.nextDouble();
        System.out.print("Enter the Marks of Soc --> ");
        Marks[3]=sc.nextDouble();
        System.out.print("Enter the Marks of Urdu --> ");
        Marks[4]=sc.nextDouble();
        for(int i=0; i< Marks.length; i++){
            System.out.println(Marks[i]);
        }
    }
}
