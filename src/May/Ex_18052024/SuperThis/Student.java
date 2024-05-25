package May.Ex_18052024;

public class Student extends Person{

    Student(){
        System.out.println("This is also a DC");
    }


    void message(){
        System.out.println("I am Student");
    }
    void display(){
        this.message();
        super.message();
    }
}
