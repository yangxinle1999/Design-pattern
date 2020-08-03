package MediatorPattern;

//中介所，持有男人和女人的引用
public class agency {
    private ManMemory manMemory;
    private WomanMemory womanMemory;

    public void getPartner(Memory memory){
        if (memory instanceof ManMemory){
            manMemory = (ManMemory) memory;
            //this.setManMemory((ManMemory) memory);
        }else {
            womanMemory = (WomanMemory) memory;
            //this.setWomanMemory((WomanMemory) memory);
        }
        if (manMemory==null || womanMemory==null){
            System.out.println("错误啦！");
        }else {
            if (manMemory.getCondition()==womanMemory.getCondition()){
                System.out.println(manMemory.getName()+"和"+womanMemory.getName()+"绝配！");
                manMemory=null; //要制空
                womanMemory=null;
            }else {
                System.out.println(manMemory.getName()+"和"+womanMemory.getName()+"不般配！");
                manMemory=null;
                womanMemory=null;
            }
        }
    }

    public ManMemory getManMemory() {
        return manMemory;
    }

    public void setManMemory(ManMemory manMemory) {
        this.manMemory = manMemory;
    }

    public WomanMemory getWomanMemory() {
        return womanMemory;
    }

    public void setWomanMemory(WomanMemory womanMemory) {
        this.womanMemory = womanMemory;
    }
}
