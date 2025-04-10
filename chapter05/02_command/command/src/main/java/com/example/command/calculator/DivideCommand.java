package com.example.command.calculator;

public class DivideCommand implements Command{

  private CalculatorNumber calculatorNumber;

  public DivideCommand(CalculatorNumber calculatorNumber) {
    this.calculatorNumber = calculatorNumber;
  }

  @Override
  public int execute() {
    return calculatorNumber.divide();
  }

  @Override
  public void undo() {
    calculatorNumber.undo();
  }
}
