package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

class WarehouseProcess extends LogisticsProcess {

  public WarehouseProcess(LogisticsCenter center) {
    super(center);
  }

  @Override
  String execute(LogisticsItem item) {
    center.process(item);
    return item.getName();
  }

}
