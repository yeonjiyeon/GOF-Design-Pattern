package logisticsCenter.product;

public class GlobalReturnProcess implements ReturnProcess{

  @Override
  public void processReturn() {
    System.out.println("Processing return in globally.");
  }
}
