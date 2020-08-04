package StatePattern;
//不吃饭的状态
public class NoneState implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("不吃饭！");
    }
}
