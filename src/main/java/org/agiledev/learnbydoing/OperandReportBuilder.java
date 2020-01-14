package org.agiledev.learnbydoing;

import java.util.List;

public class OperandReportBuilder {
  private final OperandTypeCounter operandTypeCounter;

  public OperandReportBuilder(final OperandTypeCounter operandTypeCounter) {
    this.operandTypeCounter = operandTypeCounter;
  }

  public TransformationResult build(final TransformationResult transformationResult) {

    final long luckyCount = operandTypeCounter.getCount(transformationResult, "lucky");
    final long fizzCount = operandTypeCounter.getCount(transformationResult, "fizz");
    final long buzzCount = operandTypeCounter.getCount(transformationResult, "buzz");
    final long fizzbuzzCount = operandTypeCounter.getCount(transformationResult, "fizzbuzz");
    final long integerCount = operandTypeCounter.getCount(transformationResult, "integer");
    return new TransformationResult(List.of(
        new TransformedOperand("lucky: ".concat(String.valueOf(luckyCount))),
        new TransformedOperand("fizz: ".concat(String.valueOf(fizzCount))),
        new TransformedOperand("buzz: ".concat(String.valueOf(buzzCount))),
        new TransformedOperand("fizzbuzz: ".concat(String.valueOf(fizzbuzzCount))),
        new TransformedOperand("integer: ".concat(String.valueOf(integerCount)))
        ));
  }
}
