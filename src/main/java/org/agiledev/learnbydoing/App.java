package org.agiledev.learnbydoing;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        final FizzBuzz fizzBuzz = new FizzBuzz(new OperandConverter(), new OperandReportBuilder(new OperandTypeCounter()));
        System.out.println(fizzBuzz.transform(1, 20).getTransformedString());
    }
}
