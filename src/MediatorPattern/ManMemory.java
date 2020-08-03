package MediatorPattern;

public class ManMemory extends Memory {
    public ManMemory(String name, int condition, MediatorPattern.agency agency) {
        super(name, condition, agency);
    }

    @Override
    public void getPartner(Memory memory) {
        this.getAgency().setManMemory(this); //把自己注册进去
        this.getAgency().getPartner(memory); //会把参数memory注册进去，这样就可以比较了
    }
}
