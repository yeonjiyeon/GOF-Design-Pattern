package mapSite;

public class Door extends MapSite {

  Room room1;
  Room room2;
  boolean isOpen;

  public Door(Room r1, Room r2){
      room1 = r1;
      room2 = r2;
  }

//  public Room otherSideForm(Room room){
//
//  }

  @Override
  public void enter() {

  }
}
