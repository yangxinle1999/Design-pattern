package BridgePattern;

public class test {

    public static void main(String[] args) {
        Engine2000cc engine2000cc=new Engine2000cc();
        Engine2200cc engine2200cc=new Engine2200cc();
        Car bus=new Bus(engine2000cc);
        bus.InstallEngine();
        Car bus1=new Bus(engine2200cc);
        bus1.InstallEngine();
    }
}
