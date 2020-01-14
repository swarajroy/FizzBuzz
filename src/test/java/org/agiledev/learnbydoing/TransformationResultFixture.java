package org.agiledev.learnbydoing;

import java.util.ArrayList;
import java.util.List;

public final class TransformationResultFixture {
  private TransformationResultFixture() {

  }
  public static final TransformationResult TRANSFORMATION_RESULT = new TransformationResult(getListOfTransformedOperands());

  public static final TransformationResult TRANSFORMATION_RESULT_WITH_REPORT = new TransformationResult(List.of(
      new TransformedOperand("lucky: 4"),
      new TransformedOperand("fizz: 7"),
      new TransformedOperand("buzz: 4"),
      new TransformedOperand("fizzbuzz: 1"),
      new TransformedOperand("integer: 14")
  ));

  private static List<TransformedOperand> getListOfTransformedOperands() {
    final List<TransformedOperand> transformedOperands = new ArrayList<>();
    transformedOperands.add(new TransformedOperand("1"));
    transformedOperands.add(new TransformedOperand("2"));
    transformedOperands.add(new TransformedOperand("lucky"));
    transformedOperands.add(new TransformedOperand("4"));
    transformedOperands.add(new TransformedOperand("buzz"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("7"));
    transformedOperands.add(new TransformedOperand("8"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("buzz"));

    transformedOperands.add(new TransformedOperand("11"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("lucky"));
    transformedOperands.add(new TransformedOperand("14"));
    transformedOperands.add(new TransformedOperand("fizzbuzz"));
    transformedOperands.add(new TransformedOperand("16"));
    transformedOperands.add(new TransformedOperand("17"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("19"));
    transformedOperands.add(new TransformedOperand("buzz"));

    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("22"));
    transformedOperands.add(new TransformedOperand("lucky"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("buzz"));
    transformedOperands.add(new TransformedOperand("26"));
    transformedOperands.add(new TransformedOperand("fizz"));
    transformedOperands.add(new TransformedOperand("28"));
    transformedOperands.add(new TransformedOperand("29"));
    transformedOperands.add(new TransformedOperand("lucky"));


    return transformedOperands;
  }
}
