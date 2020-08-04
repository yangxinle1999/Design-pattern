package ChainOfResponsibilityPattern;

public class HeadCarBuild extends CarBuild {
    @Override
    void HandlerCar() {
        System.out.println("组装车头！");
        if (this.carBuild!=null){
            this.carBuild.HandlerCar();
        }
    }
}
