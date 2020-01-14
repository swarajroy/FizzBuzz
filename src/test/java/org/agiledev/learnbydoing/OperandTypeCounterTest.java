package org.agiledev.learnbydoing;

import static org.agiledev.learnbydoing.TransformationResultFixture.TRANSFORMATION_RESULT;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class OperandTypeCounterTest {
  private OperandTypeCounter subjectUnderTest;
  private TransformationResult transformationResult;

  @Before
  public void setUp() {
    this.subjectUnderTest = new OperandTypeCounter();
    this.transformationResult = TRANSFORMATION_RESULT;
  }

  @Test
  public void shouldGetOperandCountForLucky() {
    Assertions.assertThat(this.subjectUnderTest.getCount(this.transformationResult, "lucky")).isEqualTo(4);
  }

  @Test
  public void shouldGetOperandCountForFizz() {
    Assertions.assertThat(this.subjectUnderTest.getCount(this.transformationResult, "fizz")).isEqualTo(7);
  }

  @Test
  public void shouldGetOperandCountForBuzz() {
    Assertions.assertThat(this.subjectUnderTest.getCount(this.transformationResult, "buzz")).isEqualTo(4);
  }

  @Test
  public void shouldGetOperandCountForFizzBuzz() {
    Assertions.assertThat(this.subjectUnderTest.getCount(this.transformationResult, "fizzbuzz")).isEqualTo(1);
  }

  @Test
  public void shouldGetOperandCountForInteger() {
    Assertions.assertThat(this.subjectUnderTest.getCount(this.transformationResult, "integer")).isEqualTo(14);
  }
}