package logisticsCenter.product;

public class KoreaReturnProcess implements ReturnProcess{

  @Override
  public void processReturn() {
    System.out.println("Processing return in Korea.");
  }
}
