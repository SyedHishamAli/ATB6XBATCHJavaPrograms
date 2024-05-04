package Ex_18042024;

public class IncDec {
    public static void main(String[] args) {
        int x=27;
        int b=89;
       // System.out.println(x++ + b-- + --x + x);
        // x Ep = 27 x = 28;
        // b Ep = 89 b = 88
        // x Ep = 27 x = 27
        System.out.println(++x + x++ + b++);
        // x Exp = 28 x = 28
        // x Ex = 28 x = 29
        // b Ex = 89 b=90
    }
}
