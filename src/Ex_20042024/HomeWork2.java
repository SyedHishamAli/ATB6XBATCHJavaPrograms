package Ex_20042024;

public class HomeWork2 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(++a + a++ + a++);
        //Exp a = 11 : a=11
        //Exp a = 11 : a=12
        //Exp a = 12 : a=13
        System.out.println(--b + b++ + ++b);
        //Exp b = 9 : b=9
        //Exp b = 9 : b=10
        //Exp b = 11 : b = 11
//        System.out.println(9+9+11);

    }
}
