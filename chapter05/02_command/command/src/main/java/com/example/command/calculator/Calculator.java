package com.example.command.calculator;

public class Calculator {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void calculate(){
    command.execute();

  }
}
