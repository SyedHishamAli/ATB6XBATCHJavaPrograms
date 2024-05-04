package May.EX_02052024;

public class DoubleArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
       // int [] b={};
        int [] b=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i]*2;
        }
        for (int j = 0; j <b.length ; j++) {
            System.out.println(b[j]);
        }

        }

    }

