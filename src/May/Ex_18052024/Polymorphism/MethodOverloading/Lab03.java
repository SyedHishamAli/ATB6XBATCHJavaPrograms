package May.Ex_18052024.MethodOverloading;

public class Lab03 {
    //Polymorphism have two concepts
    // Method Overloading and Method Over riding
    //Method over loading is when multiple methods are created with different argument/parameters
    //Method OverLoading
    void registration(String name){
        System.out.println("Name: "+name);
    }
    void registration(long phone){
        System.out.println("Mobile number: "+phone);
    }
    void registration(String Address, int pin){
        System.out.println("Address: "+Address +" "+"Pin Code: "+pin);
    }


    //Constructor Overloading
    Lab03(){}
    Lab03(int a){

    }
    Lab03(int a, int b){

    }
    public static void main(String[] args) {
     Lab03 l=new Lab03(12,45);

     //method overloading
     l.registration(7773075457l);
     l.registration("Ho no 97", 462038);
    }


}
