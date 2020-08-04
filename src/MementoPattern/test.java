package MementoPattern;

public class test {

    public static void main(String[] args) {
        Memorial memorial=new Memorial();
        Person person=new Person("yyy",16,memorial);
        System.out.println(person.toString()); //Person{name='yyy', age=16}
        person.copy(); //数据在修改之前进行备份
        person.setAge(20);
        System.out.println(person.toString()); //Person{name='yyy', age=20}
        person.restore(); //数据还原成备份状态
        System.out.println(person.toString()); //Person{name='yyy', age=16}
    }
}
