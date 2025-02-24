package logisticsCenter;

import logisticsCenter.LogisticsConstants.LogisticsItem;

abstract class LogisticsProcess {

  protected LogisticsCenter center;

  public LogisticsProcess(LogisticsCenter center) {
    this.center = center;
  }

  abstract String execute(LogisticsItem item);
}
