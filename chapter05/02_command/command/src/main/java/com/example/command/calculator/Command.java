package com.example.command.calculator;

public interface Command {
  int execute();
  void undo();
}
