package InterpreterPattern;

public class test {
    public static void main(String[] args) {
        context context=new context("20");
        addInterpreter addInterpreter=new addInterpreter();
        addInterpreter.doInterpreter(context);
        System.out.println(context.getOutput());
        subtractInterpreter subtractInterpreter=new subtractInterpreter();
        subtractInterpreter.doInterpreter(context);
        System.out.println(context.getOutput());
    }
}
