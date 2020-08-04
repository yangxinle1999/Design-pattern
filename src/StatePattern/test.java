package StatePattern;

public class test {

    public static void main(String[] args) {
        Context context=new Context(20);
        State state=new MorningState();
        state.doSomething(context);
        context.setTime(12);
        state.doSomething(context);
    }
}
