package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class GlobalWarehouse implements Warehouse {

  @Override
  public String processInbound() {
    return CountryCode.GLOBAL;
  }
}
