package com.example.command.calculator;

public class MultiplyCommand implements Command{

  private CalculatorNumber calculatorNumber;

  public MultiplyCommand(CalculatorNumber calculatorNumber) {
    this.calculatorNumber = calculatorNumber;
  }

  @Override
  public int execute() {
    return calculatorNumber.multiply();
  }

  @Override
  public void undo() {
    calculatorNumber.undo();
  }
}
