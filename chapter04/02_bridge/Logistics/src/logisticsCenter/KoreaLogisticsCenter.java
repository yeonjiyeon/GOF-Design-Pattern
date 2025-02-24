package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

class KoreaLogisticsCenter implements LogisticsCenter {

  public void process(LogisticsItem item) {
    System.out.println("[한국 물류센터] " + item + " 처리 완료!");
  }
}
