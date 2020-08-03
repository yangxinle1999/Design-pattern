package FacadePattern;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade(){
        this.systemA=new SystemA();
        this.systemB=new SystemB();
        this.systemC=new SystemC();
    }

    public void doABC(){
        systemA.doA();
        systemB.doB();
        systemC.doC();
    }

    public void doAB(){
        systemA.doA();
        systemB.doB();
    }

    public void doBC(){
        systemB.doB();
        systemC.doC();
    }
}
