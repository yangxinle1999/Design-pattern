package VisitorPattern;

public class Park implements ParkElement {

    private ParkA parkA;
    private ParkB parkB;

    public Park(){
        parkA=new ParkA();
        parkB=new ParkB();
    }
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
        parkA.accept(vistor);
        parkB.accept(vistor);
    }
}
