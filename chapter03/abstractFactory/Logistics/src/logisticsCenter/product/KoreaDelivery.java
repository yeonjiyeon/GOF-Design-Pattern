package logisticsCenter.product;

public class KoreaDelivery implements Delivery {

  @Override
  public void trackShipment() {
    System.out.println("Tracking shipment within Korea.");
  }

  @Override
  public void manageDeliveryTime() {
    System.out.println("Managing delivery time for domestic delivery in Korea.");
  }
}
