package BuilderPattern;

public class houseDirector {

    //用于调用houseBuilder来创建一个完整的房子，可以理解为一个导演,
    //可以设置顺序
    public void makeHouse(houseBuilder houseBuilder){
        houseBuilder.makeFloor();
        houseBuilder.makeHouseTop();
        houseBuilder.makeWall();
    }
}
