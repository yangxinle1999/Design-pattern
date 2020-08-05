package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<user> list=new ArrayList<>();
        list.add(new user("yyy",16));
        list.add(new user("qqq",12));
        list.add(new user("ddd",18));
        Container container=new ContainerImpl(list);
        Iterator iterator = container.getIterator();
        while (iterator.hasNext()){
            user user = (IteratorPattern.user) iterator.next();
            System.out.println(user.getAge()+user.getName());
        }
//        16yyy
//        12qqq
//        18ddd
    }
}
