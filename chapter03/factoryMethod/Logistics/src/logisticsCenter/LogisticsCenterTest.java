package logisticsCenter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import logisticsCenter.product.Delivery;
import logisticsCenter.product.GlobalDelivery;
import logisticsCenter.product.GlobalReturnProcess;
import logisticsCenter.product.GlobalWarehouse;
import logisticsCenter.product.KoreaDelivery;
import logisticsCenter.product.KoreaReturnProcess;
import logisticsCenter.product.KoreaWarehouse;
import logisticsCenter.product.ReturnProcess;
import logisticsCenter.product.Warehouse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LogisticsCenterTest {


  @Test
  @DisplayName("한국 창고 입고 테스트")
  void testKoreaWarehouseInbound() {
    Warehouse warehouse = new KoreaWarehouse();
    String processInbound = warehouse.processInbound();

    assertEquals(CountryCode.KOREA, processInbound, "입고 프로세스가 정상 동작해야 합니다.");
  }

  @Test
  @DisplayName("한국 배송 추적 테스트")
  void testKoreaDeliveryTracking() {
    Delivery delivery = new KoreaDelivery();
    String trackingResult = delivery.trackShipment();

    assertEquals(CountryCode.KOREA, trackingResult, "배송 추적이 정상 동작해야 합니다.");
  }

  @Test
  @DisplayName("한국 반품 처리 테스트")
  void testKoreaReturnProcess() {
    ReturnProcess returnProcess = new KoreaReturnProcess();
    String returnResult = returnProcess.processReturn();

    assertEquals(CountryCode.KOREA, returnResult, "반품 처리가 정상 동작해야 합니다.");
  }

  @Test
  @DisplayName("글로벌 창고 입고 테스트")
  void testGlobalWarehouseInbound() {
    Warehouse warehouse = new GlobalWarehouse();
    String result = warehouse.processInbound();

    assertEquals(CountryCode.GLOBAL, result, "입고 프로세스가 정상 동작해야 합니다.");
  }

  @Test
  @DisplayName("글로벌 배송 추적 테스트")
  void testGlobalDeliveryTracking() {
    Delivery delivery = new GlobalDelivery();
    String trackingResult = delivery.trackShipment();

    assertEquals(CountryCode.GLOBAL, trackingResult, "배송 추적이 정상 동작해야 합니다.");
  }

  @Test
  @DisplayName("글로벌 반품 처리 테스트")
  void testGlobalReturnProcess() {
    ReturnProcess returnProcess = new GlobalReturnProcess();
    String returnResult = returnProcess.processReturn();

    assertEquals(CountryCode.GLOBAL, returnResult, "반품 처리가 정상 동작해야 합니다.");
  }




}
