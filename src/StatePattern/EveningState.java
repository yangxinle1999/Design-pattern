package StatePattern;
//晚饭状态
public class EveningState implements State {
    @Override
    public void doSomething(Context context) {
        if (context.getTime()==18){
            System.out.println("吃晚饭！");
        }else {
            //context.setState(new NoneState());
            new NoneState().doSomething(context); //往下传
        }
    }
}
