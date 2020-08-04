package ChainOfResponsibilityPattern;

public class TailCarBuild extends CarBuild {
    @Override
    void HandlerCar() {
        System.out.println("组装车尾！");
        if (this.carBuild!=null){
            this.carBuild.HandlerCar();
        }
    }
}
