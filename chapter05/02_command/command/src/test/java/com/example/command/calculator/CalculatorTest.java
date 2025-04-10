package com.example.command.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {


  private CalculatorNumber number;

  @BeforeEach
  void setUp() {
     number = new CalculatorNumber(10, 2);
  }

  @Test
  void 다양한_명령을_동적으로_등록하고_순차적으로_실행할_수_있다() {

    List<Command> commands = new ArrayList<>();

    commands.add(new AddCommand(number));
    commands.add(new SubtractCommand(number));
    commands.add(new MultiplyCommand(number));
    commands.add(new DivideCommand(number));

    List<Integer> results = new ArrayList<>();

    for (Command command : commands) {
      results.add(command.execute());
    }

    // then
    assertThat(results).containsExactly(
        12,
        8,
        20,
        5
    );
  }

  @Test
  void 연산을_하고_undo를_하면_이전_상태로_돌아간다() {

    Command add = new AddCommand(number);
    add.execute();

    Command mul = new MultiplyCommand(number);
    mul.execute();

    add.undo();

    assertThat(number.getFirstNumber()).isEqualTo(10);
    assertThat(number.getSecondNumber()).isEqualTo(2);

  }

}