package Ex_20042024;

public class HomeWork3 {
    public static void main(String[] args) {
        int x = 10;
        double y = 23.123456;
        double z = 189.234;

        double result = Math.cbrt( Math.sqrt(x) + Math.sqrt(y) - Math.abs(z));
        System.out.println(result);
    }
}
