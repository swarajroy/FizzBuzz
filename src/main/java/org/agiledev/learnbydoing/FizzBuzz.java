package org.agiledev.learnbydoing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class FizzBuzz {

  private final OperandConverter operandConverter;
  private final OperandReportBuilder operandReportBuilder;

  public FizzBuzz(OperandConverter operandConverter, OperandReportBuilder operandReportBuilder) {
    this.operandConverter = operandConverter;
    this.operandReportBuilder = operandReportBuilder;
  }

  public TransformationResult transform(final int start, final int endInclusive) {
    final List<TransformedOperand> transformedOperands = IntStream.rangeClosed(start, endInclusive).mapToObj(operandConverter::convert).collect(Collectors.toList());
    final TransformationResult result1 = new TransformationResult(transformedOperands);
    final TransformationResult result2 = operandReportBuilder.build(result1);

    result1.getTransformedOperands().addAll(result2.getTransformedOperands());

    return new TransformationResult(result1.getTransformedOperands());
  }
}
