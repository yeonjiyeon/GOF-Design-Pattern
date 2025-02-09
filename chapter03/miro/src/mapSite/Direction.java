package mapSite;

public enum Direction {
  NORTH(0),
  EAST(1),
  SOUTH(2),
  WEST(3);

  private final int value;

  Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public static Direction fromValue(int value) {
    for (Direction direction : Direction.values()) {
      if (direction.value == value) {
        return direction;
      }
    }
    throw new IllegalArgumentException("Invalid value: " + value);
  }
}
