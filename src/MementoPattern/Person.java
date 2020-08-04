package MementoPattern;

public class Person {
    private String name;
    private int age;
    private Memorial memorial;

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

    public Memorial getMemorial() {
        return memorial;
    }

    public void setMemorial(Memorial memorial) {
        this.memorial = memorial;
    }

    public Person(String name, int age, Memorial memorial) {
        this.name = name;
        this.age = age;
        this.memorial=memorial;
    }

    //数据的备份
    public void copy(){
        memorial.setAge(age);
        memorial.setName(name);
    }

    //数据还原
    public void restore(){
        this.name=memorial.getName();
        this.age=memorial.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
