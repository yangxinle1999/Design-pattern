package PrototypePattern;

import java.util.List;

public class qianKeLong implements Cloneable {

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
    protected qianKeLong clone() throws CloneNotSupportedException {
        return (qianKeLong) super.clone();
    }
}
