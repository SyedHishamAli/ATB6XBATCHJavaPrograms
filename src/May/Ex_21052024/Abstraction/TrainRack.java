package May.Ex_21052024.Abstraction;

public class TrainRack extends Locomotive{


    void departure(){
        System.out.println("Horn is given now train is departing");
    }
    void arrived(){
        System.out.println("SA9 Break applied, MR1 BP pressure is released");
    }

    @Override
    void locoPilot() {
        System.out.println("Notch pushed forward");
    }

    @Override
    void assistantlocoPilot() {
        System.out.println("Given green flag");
    }

}
