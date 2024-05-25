package May.Ex_18052024;

import org.w3c.dom.ls.LSOutput;

public class Lab02 {
    //constructor chaining. when child object is made it calls not only child constructor but also parent constructor.
    public static void main(String[] args) {
        Dog d=new Dog("Hound");
        d.display();


    }
}

class Animal{
    String type;
    Animal(){
        System.out.println("DC");
    }
    Animal(String type){
        this.type=type;
    }
}

class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println("Child-DC");
    }
    Dog(String breed){
        super("Dog");
        this.breed=breed;
    }
    void display(){
        System.out.println(this.breed+" "+ this.type);
        System.out.println("Run very fast");
    }
}