package org.agiledev.learnbydoing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
  private FizzBuzz subjectUnderTest;

  @Before
  public void setUp() {
    this.subjectUnderTest = new FizzBuzz(new OperandConverter(), new OperandReportBuilder(new OperandTypeCounter()));
  }

  @Test
  public void shouldGetATransformedRangeForGivenInputRange() {
    //given
    //final String expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
    final String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz lucky: 2 fizz: 4 buzz: 3 fizzbuzz: 1 integer: 10";
    //when
    final TransformationResult actual = this.subjectUnderTest.transform(1, 20);

    //then
    assertThat(actual.getTransformedString()).isEqualTo(expected);
  }
}