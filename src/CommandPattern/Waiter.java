package CommandPattern;

//服务员，客户端直接与服务员打交道
public class Waiter {
    private Command command;
    public Waiter(Command command){
        this.command=command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sail(){
        command.sail();
    }
}
