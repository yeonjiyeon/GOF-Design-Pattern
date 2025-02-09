package logisticsCenter;

import logisticsCenter.factory.GlobalLogisticsFactory;
import logisticsCenter.factory.KoreaLogisticsFactory;
import logisticsCenter.factory.LogisticsFactory;
import logisticsCenter.product.Delivery;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;

public class LogisticsCenterTest {
  public static void main(String[] args) {

    LogisticsFactory koreaFactory =  new KoreaLogisticsFactory();
    Warehouse koreaWarehouse = koreaFactory.createWarehouse();
    Delivery koreaDelivery = koreaFactory.createDelivery();
    ReturnProcess koreaReturn = koreaFactory.createReturnProcess();

    koreaWarehouse.processInbound();
    koreaDelivery.trackShipment();
    koreaReturn.processReturn();


    LogisticsFactory globalFactory =  new GlobalLogisticsFactory();
    Warehouse globalWarehouse = globalFactory.createWarehouse();
    Delivery globalDelivery = globalFactory.createDelivery();
    ReturnProcess globalReturn = globalFactory.createReturnProcess();

    globalWarehouse.processInbound();
    globalDelivery.trackShipment();
    globalReturn.processReturn();
  }
}
