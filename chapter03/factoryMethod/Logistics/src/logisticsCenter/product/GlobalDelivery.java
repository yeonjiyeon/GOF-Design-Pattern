package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class GlobalDelivery implements Delivery {

  @Override
  public String trackShipment() {
    return CountryCode.GLOBAL;
  }

  @Override
  public String manageDeliveryTime() {
    return CountryCode.GLOBAL;
  }
}
