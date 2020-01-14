package org.agiledev.learnbydoing;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class TransformationResult {
  private final List<TransformedOperand> transformedOperands;
  private final String transformedString;

  public TransformationResult(final List<TransformedOperand> transformedOperands) {
    this.transformedOperands = transformedOperands;
    this.transformedString = String.join(" ", getTransformedStringOperands());
  }

  public String getTransformedString() {
    return transformedString;
  }

  protected List<String> getTransformedStringOperands() {
    return !this.transformedOperands.isEmpty() ? this.transformedOperands.stream().map(TransformedOperand::getValue).collect(Collectors.toList()) : List.of();
  }

  protected List<TransformedOperand> getTransformedOperands() {
    return transformedOperands;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformationResult result = (TransformationResult) o;
    return Objects.equals(transformedOperands, result.transformedOperands) && Objects.equals(transformedString, result.transformedString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transformedOperands, transformedString);
  }

  @Override
  public String toString() {
    return "TransformationResult{" + "transformedOperands=" + transformedOperands + ", transformedString='" + transformedString + '\'' + '}';
  }
}
