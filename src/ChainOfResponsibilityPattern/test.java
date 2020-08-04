package ChainOfResponsibilityPattern;

public class test {

    public static void main(String[] args) {
        //new HeadCarBuild().setNextCarBuild(new BodyCarBuild().setNextCarBuild(new TailCarBuild())).HandlerCar();
        HeadCarBuild headCarBuild = new HeadCarBuild();
        BodyCarBuild bodyCarBuild = new BodyCarBuild();
        TailCarBuild tailCarBuild = new TailCarBuild();
        headCarBuild.setNextCarBuild(bodyCarBuild);
        bodyCarBuild.setNextCarBuild(tailCarBuild);
        headCarBuild.HandlerCar();

        System.out.println("---------");

        headCarBuild.setNextCarBuild(bodyCarBuild).setNextCarBuild(tailCarBuild);
        headCarBuild.HandlerCar();
    }
}
