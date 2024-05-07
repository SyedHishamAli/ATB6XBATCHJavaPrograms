package EX_02052024;

import java.sql.SQLOutput;

public class MaxSalary {
    public static void main(String[] args) {
        int [] Salary={100, 50, 999, 30, 60, 90};
        int max=Salary[0];
//        for (int i = 0; i <Salary.length ; i++) {
//            if (max<Salary[i]){
//                max=Salary[i];
//            }
//        }
        int i=0;
        do{
            if (Salary[i]>max){
                max=Salary[i];
            }
           i++;
        }while(i< Salary.length);
        System.out.println(max);
    }
}
