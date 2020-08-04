package ChainOfResponsibilityPattern;

public class BodyCarBuild extends CarBuild {
    @Override
    void HandlerCar() {
        System.out.println("组装车身！");
        if (this.carBuild!=null){
            this.carBuild.HandlerCar();
        }
    }
}
