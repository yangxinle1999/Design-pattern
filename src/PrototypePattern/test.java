package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        person person=new person();
        person.setAge(11);
        person.setName("ffff");

        try {
            person person1=person.clone();
            System.out.println(person==person1);  //false,说明person和person1指向的是两个不同的person对象，互不影响
            System.out.println(person.getAge());
            System.out.println(person.getName());
            System.out.println(person1.getAge());
            System.out.println(person1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        qianKeLong qianKeLong=new qianKeLong();
        qianKeLong.setAge(14);
        List<String> list=new ArrayList<>();
        list.add("aaa");
        qianKeLong.setList(list);
        try {
            qianKeLong qianKeLong1=qianKeLong.clone();
            System.out.println(qianKeLong.getList().get(0));
            System.out.println(qianKeLong1.getList().get(0));
            System.out.println(qianKeLong==qianKeLong1);  //false,说明qianKeLong和qianKeLong1指向的是两个不同的qianKeLong对象，互不影响
            System.out.println(qianKeLong.getList()==qianKeLong1.getList()); //true，说明两个list使用的一个，会相互影响，这种引用类型会相互影响，称为浅拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        shenKeLong shenKeLong=new shenKeLong();
        shenKeLong.setAge(18);
        List<String> list1=new ArrayList<>();
        list1.add("bbb");
        shenKeLong.setList(list1);
        try {
            shenKeLong clone = shenKeLong.clone();
            System.out.println(shenKeLong==clone); //false
            System.out.println(shenKeLong.getList()==clone.getList());  //false(深拷贝，两个list互不影响)
            System.out.println(shenKeLong.getList().get(0)); //bbb
            System.out.println(clone.getList().get(0));  //bbb
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
