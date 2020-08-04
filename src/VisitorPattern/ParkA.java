package VisitorPattern;

//公园A的部分
public class ParkA implements ParkElement {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
