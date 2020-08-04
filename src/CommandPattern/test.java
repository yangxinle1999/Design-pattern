package CommandPattern;

public class test {

    public static void main(String[] args) {
        Peddler peddler=new Peddler();
        Command command=new AppleCommand(peddler);
        Command command1=new BananaCommand(peddler);
        command.sail(); //卖苹果！
        command1.sail(); //卖香蕉！
        System.out.println("------------");
        Waiter waiter=new Waiter(command); //客户端直接与服务员打交道
        waiter.sail(); //卖苹果！
    }
}
