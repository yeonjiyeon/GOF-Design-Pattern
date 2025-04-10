package com.example.command.calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class CalculatorNumber {

  private int firstNumber;
  private int secondNumber;

  private Deque<NumberState> history = new ArrayDeque<>();

  public CalculatorNumber(int firstNumber, int secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  public int getFirstNumber() {
    return firstNumber;
  }

  public int getSecondNumber() {
    return secondNumber;
  }

  public int add() {
    saveState();
    return firstNumber + secondNumber;
  }

  public int subtract() {
    saveState();
    return firstNumber - secondNumber;
  }

  public int multiply() {
    saveState();
    return firstNumber * secondNumber;
  }

  public int divide() {
    saveState();
    return firstNumber / secondNumber;
  }

  public void undo() {
    if (!history.isEmpty()) {
      NumberState prev = history.pop();
      this.firstNumber = prev.first;
      this.secondNumber = prev.second;
    }
  }

  private void saveState() {
    history.push(new NumberState(firstNumber, secondNumber));
  }

  private static class NumberState {
    int first;
    int second;

    NumberState(int first, int second) {
      this.first = first;
      this.second = second;
    }
  }

}
