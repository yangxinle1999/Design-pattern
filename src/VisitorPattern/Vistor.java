package VisitorPattern;

//访问者
public interface Vistor {
    public void visit(ParkA parkA);
    public void visit(ParkB parkB);
    public void visit(Park park);
}
