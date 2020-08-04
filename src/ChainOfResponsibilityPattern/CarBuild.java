package ChainOfResponsibilityPattern;

public abstract class CarBuild {

    protected CarBuild carBuild;
    public CarBuild setNextCarBuild(CarBuild carBuild){
        this.carBuild=carBuild;
        return carBuild;
    }

    abstract void HandlerCar();
}
