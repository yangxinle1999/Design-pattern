package MediatorPattern;

public class WomanMemory extends Memory {
    public WomanMemory(String name, int condition, MediatorPattern.agency agency) {
        super(name, condition, agency);
    }

    @Override
    public void getPartner(Memory memory) {
        this.getAgency().setWomanMemory(this);//把自己注册到中介所
        this.getAgency().getPartner(memory);//会把参数memory注册进去，这样就可以比较了
    }
}
