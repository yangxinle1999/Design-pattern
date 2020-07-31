package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class shenKeLong implements Cloneable {

    private String name;
    private int age;
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected shenKeLong clone() throws CloneNotSupportedException {
        shenKeLong clone1 = (shenKeLong) super.clone();
        List<String> list1=new ArrayList<>();
        for (String list2 : list){
            list1.add(list2);
        }
        clone1.setList(list1);
        return clone1;
    }
}
