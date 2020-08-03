package InterpreterPattern;

public class context {
    private String input;
    private int output;

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
