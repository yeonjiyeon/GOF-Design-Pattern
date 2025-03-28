package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

class GlobalLogisticsCenter implements LogisticsCenter {

  public void process(LogisticsItem item) {
    System.out.println("[글로벌  물류센터] " + item + " 처리 완료!");
  }
}
