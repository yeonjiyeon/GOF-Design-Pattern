package com.example.command.calculator;

public class SubtractCommand implements Command{

  private CalculatorNumber calculatorNumber;

  public SubtractCommand(CalculatorNumber calculatorNumber) {
    this.calculatorNumber = calculatorNumber;
  }

  @Override
  public int execute() {
    return calculatorNumber.subtract();
  }

  @Override
  public void undo() {
    calculatorNumber.undo();
  }
}
