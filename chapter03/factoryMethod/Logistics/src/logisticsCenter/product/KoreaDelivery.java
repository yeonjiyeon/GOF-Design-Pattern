package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class KoreaDelivery implements Delivery {

  @Override
  public String trackShipment() {
    return CountryCode.KOREA;
  }

  @Override
  public String manageDeliveryTime() {
    return CountryCode.KOREA;
  }
}
