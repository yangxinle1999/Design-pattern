package BuilderPattern;


//负责创建房间的内部结构
public class pingFangHouseBuilder implements houseBuilder {

    house house1=new house();
    @Override
    public void makeFloor() {
        house1.setFloor("平房--->地板");
    }

    @Override
    public void makeWall() {
        house1.setWall("平房--->墙");
    }

    @Override
    public void makeHouseTop() {
        house1.setHouseTop("平房--->屋顶");
    }

    @Override
    public house getHouse() {
        return house1;
    }
}
