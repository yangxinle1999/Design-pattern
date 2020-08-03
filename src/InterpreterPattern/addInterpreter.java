package InterpreterPattern;

public class addInterpreter extends Interpreter {
    @Override
    public void doInterpreter(context context) {
        String input = context.getInput();
        int i = Integer.parseInt(input);
        ++i;
        context.setInput(String.valueOf(i)); //重新赋值
        context.setOutput(i); //重新赋值
    }
}
