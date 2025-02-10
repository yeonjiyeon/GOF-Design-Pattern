package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class KoreaReturnProcess implements ReturnProcess{

  @Override
  public String processReturn() {
    return CountryCode.KOREA;
  }
}
