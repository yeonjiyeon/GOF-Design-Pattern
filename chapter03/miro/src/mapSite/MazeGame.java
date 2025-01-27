package mapSite;

public class MazeGame {
  public Maze createMaze() {
    Maze maze = new Maze();
    Room r1 = new Room(1);
    Room r2 = new Room(2);
    Door theDoor = new Door(r1, r2);

    maze.addRoom(r1);
    maze.addRoom(r2);

    r1.setSide(Direction.EAST, theDoor);

    r2.setSide(Direction.WEST, theDoor);

    return maze;
  }
}
