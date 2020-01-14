package org.agiledev.learnbydoing;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class OperandTypeCounter {
  public long getCount(final TransformationResult transformationResult, final String criteria) {
    final List<String> operands = transformationResult.getTransformedStringOperands() ;
    if (criteria.equals("integer")) {
      return operands.stream().filter(StringUtils::isNumeric).count();
    }
    return operands.stream().filter(operand -> operand.equals(criteria))
        .count();
  }
}
