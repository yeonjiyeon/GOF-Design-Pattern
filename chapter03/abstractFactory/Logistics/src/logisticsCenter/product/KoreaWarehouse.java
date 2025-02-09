package logisticsCenter.product;

public class KoreaWarehouse implements Warehouse{

  @Override
  public void processInbound() {
    System.out.println("Processing inbound goods in Korea.");
  }

  @Override
  public void manageInventory() {
    System.out.println("Managing inventory in Korea.");
  }
}
