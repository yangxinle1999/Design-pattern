package VisitorPattern;

//清洁工A，专门负责公园A部分的卫生情况
public class VistorA implements Vistor {
    @Override
    public void visit(ParkA parkA) {
        System.out.println("清洁工A负责A部分");
    }

    @Override
    public void visit(ParkB parkB) {

    }

    @Override
    public void visit(Park park) {

    }
}
