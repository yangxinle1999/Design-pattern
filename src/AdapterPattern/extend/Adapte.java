package AdapterPattern.extend;

//使用继承方式实现的适配器
public class Adapte extends use220V {
    public void use18V(){
        this.use220(); //调用父类方法
        System.out.println("使用适配器将220V电压改造成18V");
    }
}
