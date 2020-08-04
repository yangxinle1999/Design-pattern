package VisitorPattern;
//清洁工B，负责公园B部分的卫生
public class VistorB implements Vistor {
    @Override
    public void visit(ParkA parkA) {

    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("清洁工B负责B部分");
    }

    @Override
    public void visit(Park park) {

    }
}
