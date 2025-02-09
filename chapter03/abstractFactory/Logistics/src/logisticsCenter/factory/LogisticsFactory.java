package logisticsCenter.factory;

import logisticsCenter.product.Delivery;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;

public interface LogisticsFactory {

  Warehouse createWarehouse();

  Delivery createDelivery();

  ReturnProcess createReturnProcess();
}
