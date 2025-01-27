package logisticsCenter.product;

public class GlobalDelivery implements Delivery {

  @Override
  public void trackShipment() {
    System.out.println("Tracking shipment within globally.");
  }

  @Override
  public void manageDeliveryTime() {
    System.out.println("Managing delivery time for domestic delivery in globally.");
  }
}
