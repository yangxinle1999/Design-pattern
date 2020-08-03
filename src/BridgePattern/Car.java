package BridgePattern;

public abstract class Car {

    private Engine engine; //Engine引用
    public Car(Engine engine){
        this.engine=engine;
    }

    public abstract void InstallEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
