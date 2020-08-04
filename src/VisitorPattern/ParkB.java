package VisitorPattern;

//公园B的部分
public class ParkB implements ParkElement {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
