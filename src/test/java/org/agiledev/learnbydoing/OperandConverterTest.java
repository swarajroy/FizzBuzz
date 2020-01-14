package org.agiledev.learnbydoing;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class OperandConverterTest {
  private OperandConverter subjectUnderTest;

  @Before
  public void setUp() {
    this.subjectUnderTest = new OperandConverter();
  }

  @Test
  public void shouldGetFizzBuzzIfNumberIsAMultipleOf3And5() {
    Assertions.assertThat(this.subjectUnderTest.convert(15)).isEqualTo(new TransformedOperand("fizzbuzz"));
  }

  @Test
  public void shouldGetFizzIfNumberIsAMultipleOf3() {
    Assertions.assertThat(this.subjectUnderTest.convert(6)).isEqualTo(new TransformedOperand("fizz"));
  }

  @Test
  public void shouldGetBuzzIfNumberIsAMultipleOf5() {
    Assertions.assertThat(this.subjectUnderTest.convert(10)).isEqualTo(new TransformedOperand("buzz"));
  }

  @Test
  public void shoudGetNumberIfNumberIsNeitherAMultipleOf3Or5() {
    Assertions.assertThat(this.subjectUnderTest.convert(7)).isEqualTo(new TransformedOperand("7"));
  }

  @Test
  public void shouldGetLuckyIfNumberContains3() {
    Assertions.assertThat(this.subjectUnderTest.convert(3)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(13)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(23)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(39)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(30)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(31)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(32)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(33)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(34)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(35)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(36)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(37)).isEqualTo(new TransformedOperand("lucky"));
    Assertions.assertThat(this.subjectUnderTest.convert(38)).isEqualTo(new TransformedOperand("lucky"));
  }

  @Test
  public void contains3() {
    Assertions.assertThat(this.subjectUnderTest.contains3(3)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(13)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(23)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(30)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(31)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(32)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(33)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(34)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(35)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(36)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(37)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(38)).isTrue();
    Assertions.assertThat(this.subjectUnderTest.contains3(39)).isTrue();

  }
}