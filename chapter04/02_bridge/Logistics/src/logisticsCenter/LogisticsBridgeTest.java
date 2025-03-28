package logisticsCenter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import logisticsCenter.LogisticsConstants.LogisticsItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogisticsBridgeTest {

  @Test
  @DisplayName("한국 물류센터 테스트")
  void testKoreaLogisticsCenter() {
    LogisticsCenter koreaCenter = new KoreaLogisticsCenter();

    LogisticsProcess warehouse = new WarehouseProcess(koreaCenter);
    LogisticsProcess delivery = new DeliveryProcess(koreaCenter);
    LogisticsProcess returnProcess = new ReturnProcess(koreaCenter);

    assertEquals(LogisticsItem.LAPTOP.getName(),
        warehouse.execute(LogisticsItem.LAPTOP));
    assertEquals(LogisticsItem.LAPTOP.getName(),
        delivery.execute(LogisticsItem.LAPTOP));
    assertEquals(LogisticsItem.LAPTOP.getName(),
        returnProcess.execute(LogisticsItem.LAPTOP));
  }

  @Test
  @DisplayName("글로벌 물류센터 테스트")
  void testGlobalLogisticsCenter() {
    LogisticsCenter globalCenter = new GlobalLogisticsCenter();

    LogisticsProcess warehouse = new WarehouseProcess(globalCenter);
    LogisticsProcess delivery = new DeliveryProcess(globalCenter);
    LogisticsProcess returnProcess = new ReturnProcess(globalCenter);

    assertEquals(LogisticsItem.SMARTPHONE.getName(),
        warehouse.execute(LogisticsItem.SMARTPHONE));
    assertEquals(LogisticsItem.SMARTPHONE.getName(),
        delivery.execute(LogisticsItem.SMARTPHONE));
    assertEquals(LogisticsItem.SMARTPHONE.getName(),
        returnProcess.execute(LogisticsItem.SMARTPHONE));
  }
}