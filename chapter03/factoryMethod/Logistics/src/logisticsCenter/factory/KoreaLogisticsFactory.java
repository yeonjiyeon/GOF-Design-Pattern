package logisticsCenter.factory;

import logisticsCenter.product.Delivery;
import logisticsCenter.product.KoreaDelivery;
import logisticsCenter.product.KoreaReturnProcess;
import logisticsCenter.product.KoreaWarehouse;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;

public class KoreaLogisticsFactory extends LogisticsFactory {

  @Override
  public Warehouse createWarehouse() {
    return new KoreaWarehouse();
  }

  @Override
  public Delivery createDelivery() {
    return new KoreaDelivery();
  }

  @Override
  public ReturnProcess createReturnProcess() {
    return new KoreaReturnProcess();
  }

}
