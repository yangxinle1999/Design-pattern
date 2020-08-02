package FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {

    private final static HashMap<String,shape> hashMap=new HashMap<>();

    public static shape getCircle(String color){
        shape circle = hashMap.get(color); //通过hashmap存储数据，传来的color作为key，circle作为value
        if (circle==null){
            circle=new Circle(color);
            hashMap.put(color,circle);  //新创建的话就放到map里面
            System.out.println("新创建了一个circle对象"); //打印新创建的信息
        }
        return circle; //map有数据就直接返回，不用创建了
    }
}
