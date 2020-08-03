package MediatorPattern;

public class test {
    public static void main(String[] args) {
        agency agency=new agency();
        ManMemory manMemory=new ManMemory("张三",5,agency);
        WomanMemory womanMemory=new WomanMemory("小红",5,agency);
        WomanMemory womanMemory1=new WomanMemory("小米",6,agency);
        manMemory.getPartner(womanMemory);
        womanMemory.getPartner(womanMemory1);
        manMemory.getPartner(womanMemory1);
    }
}
