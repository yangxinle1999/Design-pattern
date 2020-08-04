package TemplatePattern;

//模板类
public abstract class MakeCar {

    public abstract void makeHead();

    public abstract void makeBody();

    public abstract void makeTail();

    //造车的步骤相同，只是内部方法实现不同
    public void make(){
        makeHead();
        makeBody();
        makeTail();
    }
}
