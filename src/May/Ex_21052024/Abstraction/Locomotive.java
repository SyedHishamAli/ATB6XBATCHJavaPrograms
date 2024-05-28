package May.Ex_21052024.Abstraction;

abstract class Locomotive extends PowerLocomotive{
    abstract void locoPilot();
    abstract void assistantlocoPilot();

    @Override
    void panto() {
        System.out.println("Pantograph is raised");
    }

    @Override
    void breaKSA9() {
        System.out.println("SA9 lever is down, pressure is applied through MR 1 and BP is high");
    }
}
