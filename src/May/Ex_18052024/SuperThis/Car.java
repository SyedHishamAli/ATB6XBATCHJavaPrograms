package May.Ex_18052024;

public class Car extends Vehicle{
    int maxSpeed=180;
    void display(){
        System.out.println("Max speed of vehicle can be -->"+ super.maxSpeed);
        System.out.println("Max speed of vehicle can be -->"+ this.maxSpeed);
    }
}
