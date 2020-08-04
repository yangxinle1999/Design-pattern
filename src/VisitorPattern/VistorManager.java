package VisitorPattern;

//管理员负责检查整个公园的卫生
public class VistorManager implements Vistor {
    @Override
    public void visit(ParkA parkA) {
        System.out.println("管理员负责检查公园A！");
    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("管理员负责检查公园B！");
    }

    @Override
    public void visit(Park park) {
        System.out.println("管理员负责检查整个公园！");
    }
}
