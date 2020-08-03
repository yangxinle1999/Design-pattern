package MediatorPattern;

//结婚的父类,持有中介所的引用
public abstract class Memory {
    private String name;
    private int condition;
    private agency agency;

    public abstract void getPartner(Memory memory);

    public Memory(String name, int condition, MediatorPattern.agency agency) {
        this.name = name;
        this.condition = condition;
        this.agency = agency;
    }

    public MediatorPattern.agency getAgency() {
        return agency;
    }

    public void setAgency(MediatorPattern.agency agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
