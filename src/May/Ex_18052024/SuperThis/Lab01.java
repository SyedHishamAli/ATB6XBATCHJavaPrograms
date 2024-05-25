package May.Ex_18052024;

public class Lab01 {
    //Super keyword in java
    //Parent Class --> Child Class
    //Super keyword reference to parent class
    //It can reference to
    //Variable of parent, Method of parent, and Constructor of parent.
    //If child has default constructor then parent default will always called because keyword is used by default

    public static void main(String[] args) {
//        Car c=new Car();
//        c.display();

        Student s=new Student();
        s.display();
    }

    //So the thing is
    //If you want to use super keyword
    //super.variable
    //super.method
    //super(); to call parent default constructor
    //super("String"); to call Parameterized constructor

}









