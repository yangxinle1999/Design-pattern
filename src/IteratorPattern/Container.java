package IteratorPattern;

//因为是以内部类的形式手写迭代器，所以要提供一个方法可以访问到迭代器
public interface Container {
     Iterator getIterator();
}
