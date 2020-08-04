package VisitorPattern;

//公园每一部分的抽象
public interface ParkElement {
     void accept(Vistor vistor); //用于接纳访问者
}
