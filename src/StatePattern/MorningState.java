package StatePattern;
//早饭状态
public class MorningState implements State {
    @Override
    public void doSomething(Context context) {
        if (context.getTime()==7){
            System.out.println("吃早饭！");
        }else {
           // context.setState(new NoonState());
            new NoonState().doSomething(context); //往下传
        }
    }
}
