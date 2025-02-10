package logisticsCenter.product;

import logisticsCenter.CountryCode;

public class GlobalReturnProcess implements ReturnProcess{

  @Override
  public String processReturn() {
    return CountryCode.GLOBAL;
  }
}
