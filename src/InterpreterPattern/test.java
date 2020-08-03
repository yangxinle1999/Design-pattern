package InterpreterPattern;

public class test {
    public static void main(String[] args) {
        context context=new context("20");
        addInterpreter addInterpreter=new addInterpreter();
        addInterpreter.doInterpreter(context); //执行语法
        System.out.println(context.getOutput());
        subtractInterpreter subtractInterpreter=new subtractInterpreter();
        subtractInterpreter.doInterpreter(context); //执行语法
        System.out.println(context.getOutput());
    }
}
