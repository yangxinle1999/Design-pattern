package VisitorPattern;

public class test {

    public static void main(String[] args) {
        Park park=new Park();
        VistorA vistorA=new VistorA();
        park.accept(vistorA); //清洁工A负责A部分
        VistorB vistorB=new VistorB();
        park.accept(vistorB); //清洁工B负责B部分
        VistorManager vistorManager=new VistorManager();
        park.accept(vistorManager); //管理员负责检查整个公园！ 管理员负责检查公园A！ 管理员负责检查公园B！
    }
}
