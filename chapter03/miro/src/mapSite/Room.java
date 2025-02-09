package mapSite;

public class Room extends MapSite {

  private MapSite[] sides = new MapSite[4];
  private int roomNumber;//미로 방 식별

  //여기에 모든 면을 벽으로 초기화 하면
  public Room(int roomNo) {
    roomNumber = roomNo;
    for (Direction direction : Direction.values()) {
      sides[direction.getValue()] = new Wall();
    }
  }

//  public MapSite getSide(Direction direction){
//      return sides[direction.]
//  }

  public void setSide(Direction direction, MapSite mapSite){
    sides[direction.getValue()] = mapSite;
  }

  @Override
  public void enter() {

  }
}
