package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

class DeliveryProcess extends LogisticsProcess {

  public DeliveryProcess(LogisticsCenter center) {
    super(center);
  }

  @Override
  String execute(LogisticsItem item) {
    center.process(item);
    return item.getName();
  }
}
