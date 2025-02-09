package logisticsCenter.product;

public class GlobalWarehouse implements Warehouse{

  @Override
  public void processInbound() {
    System.out.println("Processing inbound goods in globally.");
  }

  @Override
  public void manageInventory() {
    System.out.println("Managing inventory in globally.");
  }
}
