package AdapterPattern.Commission;

public class test {
    public static void main(String[] args) {
        Adapte adapte=new Adapte(new use220V());
        adapte.use18V(); //220V的电压！ 使用适配器将220V电压改造成18V
    }
}
