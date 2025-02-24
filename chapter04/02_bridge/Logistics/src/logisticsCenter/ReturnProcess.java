package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

public class ReturnProcess extends LogisticsProcess {

  public ReturnProcess(LogisticsCenter center) {
    super(center);
  }

  @Override
  String execute(LogisticsItem item) {

    center.process(item);
    return item.getName();
  }
}
