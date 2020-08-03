package AdapterPattern.Commission;

//使用委让方式实现的适配器
public class Adapte {
    private use220V use220V;
    public Adapte(use220V use220V){
        this.use220V=use220V;
    }
    public void use18V(){
        use220V.use220();
        System.out.println("使用适配器将220V电压改造成18V");
    }
}
