package logisticsCenter;

public class LogisticsConstants {

  public enum Country {
    KOREA, GLOBAL
  }

  public enum LogisticsItem {
    LAPTOP("노트북"),
    SMARTPHONE("스마트폰");

    private final String name;

    LogisticsItem(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
