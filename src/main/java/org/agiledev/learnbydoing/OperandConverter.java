package org.agiledev.learnbydoing;

public class OperandConverter {

  public TransformedOperand convert(final int operand) {
    TransformedOperand result;
    if (contains3(operand)) {
      result = new TransformedOperand( "lucky");
    } else if (operand % 3 == 0 && operand % 5 == 0) {
      result = new TransformedOperand( "fizzbuzz");
    } else if (operand % 3 == 0) {
      result = new TransformedOperand( "fizz");
    } else if (operand % 5 == 0) {
      result = new TransformedOperand( "buzz");
    } else {
      result = new TransformedOperand( String.valueOf(operand));
    }
    return result;
  }

  public boolean contains3(int number) {
    while(number > 0)
    {
      if(number % 10 == 3)
        return true;

      number = number/10;
    }
    return false;
  }
}
