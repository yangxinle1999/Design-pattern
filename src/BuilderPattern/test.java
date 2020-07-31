package BuilderPattern;

public class test {

    public static void main(String[] args) {
        houseBuilder houseBuilder=new pingFangHouseBuilder();
        houseDirector houseDirector=new houseDirector();
        houseDirector.makeHouse(houseBuilder);
        house house = houseBuilder.getHouse();
        System.out.println(house.getFloor()+house.getWall()+house.getHouseTop());
    }
}
