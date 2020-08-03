package InterpreterPattern;

//需要解释的文法类
public class context {
    private String input; //输入
    private int output;  //输出

    public context(String input){
        this.input=input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
