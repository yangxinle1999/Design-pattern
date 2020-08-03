package FacadePattern;

public class test {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.doAB();
        facade.doABC();
        facade.doBC();
    }
}
