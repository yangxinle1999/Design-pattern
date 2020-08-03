package BridgePattern;

public class Bus extends Car {
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void InstallEngine() {
        System.out.print("Bus:");
        this.getEngine().InstallEngine();
    }
}
