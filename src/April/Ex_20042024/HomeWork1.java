package Ex_20042024;

public class HomeWork1 {
    public  static void main(String[] args) {
      int x=98;
      int g=101;
      int t=45;
//      int max = t>g ? t: g;
//      int min = t>x ? t: x;
        int max= (t>g) && (t>x) ? t: g;
        int min= (g<x) && (g<t)? g: t;
        System.out.println("The max value is -> "+ max);
        System.out.println("The min value is -> "+ min);

    }
}
