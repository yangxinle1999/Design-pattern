package StatePattern;
//中午的状态
public class NoonState implements State {
    @Override
    public void doSomething(Context context) {
        if (context.getTime()==12){
            System.out.println("吃午饭！");
        }else {
            //context.setState(new EveningState());
            new EveningState().doSomething(context); //往下传
        }
    }
}
