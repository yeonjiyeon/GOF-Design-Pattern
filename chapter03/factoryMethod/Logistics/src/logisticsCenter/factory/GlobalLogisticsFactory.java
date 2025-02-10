package logisticsCenter.factory;

import logisticsCenter.product.Delivery;
import logisticsCenter.product.GlobalDelivery;
import logisticsCenter.product.GlobalReturnProcess;
import logisticsCenter.product.GlobalWarehouse;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;

public class GlobalLogisticsFactory extends LogisticsFactory {

  @Override
  public Warehouse createWarehouse() {
    return new GlobalWarehouse();
  }

  @Override
  public Delivery createDelivery() {
    return new GlobalDelivery();
  }

  @Override
  public ReturnProcess createReturnProcess() {
    return new GlobalReturnProcess();
  }

}
