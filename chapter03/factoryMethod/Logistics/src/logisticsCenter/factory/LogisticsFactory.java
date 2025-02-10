package logisticsCenter.factory;

import logisticsCenter.product.Delivery;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;

public abstract class LogisticsFactory {

  public abstract Warehouse createWarehouse();

  public abstract Delivery createDelivery();

  public abstract ReturnProcess createReturnProcess();
}
