package IteratorPattern;

import java.util.List;

//实现类，可以得到迭代器
public class ContainerImpl implements Container {

    private List<user> list;
    private int index; //默认值是0

    public ContainerImpl(List<user> list){
        this.list=list;
    }
    @Override
    public Iterator getIterator() {  //得到迭代器
        return new IteratroImpl();
    }

    //定义内部类实现Iterator接口（手写迭代器）
    private class IteratroImpl implements Iterator{

        @Override
        public boolean hasNext() {
            if (index<list.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return list.get(index++); //因为get是从0开始的，所以这里很巧妙，先运算再赋值
            }
            return null;
        }
    }
}
