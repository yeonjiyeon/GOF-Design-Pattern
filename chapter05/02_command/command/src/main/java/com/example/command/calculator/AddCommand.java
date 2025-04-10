package com.example.command.calculator;

public class AddCommand implements Command{

  private CalculatorNumber calculatorNumber;

  public AddCommand(CalculatorNumber calculatorNumber) {
    this.calculatorNumber = calculatorNumber;
  }

  @Override
  public int execute() {
    return calculatorNumber.add();
  }

  @Override
  public void undo() {
    calculatorNumber.undo();
  }
}
