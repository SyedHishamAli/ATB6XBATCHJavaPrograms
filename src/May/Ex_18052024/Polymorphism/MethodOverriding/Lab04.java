package May.Ex_18052024.MethodOverriding;

public class Lab04 {
    public static void main(String[] args) {
        Dog g=new Hound();
        //This Dynamic dispatch ----> is runtime polymorphism
        //This Method Over riding
        g.bark();
    }
}
