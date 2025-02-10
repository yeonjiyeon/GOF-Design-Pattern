package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class KoreaWarehouse implements Warehouse{

  @Override
  public String processInbound() {

    return CountryCode.KOREA;
  }
}
