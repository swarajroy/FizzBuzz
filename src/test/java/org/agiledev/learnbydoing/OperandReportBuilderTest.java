package org.agiledev.learnbydoing;

import static org.agiledev.learnbydoing.TransformationResultFixture.TRANSFORMATION_RESULT;
import static org.agiledev.learnbydoing.TransformationResultFixture.TRANSFORMATION_RESULT_WITH_REPORT;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.*;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OperandReportBuilderTest {
  private OperandReportBuilder subjectUnderTest;

  @Mock
  private OperandTypeCounter operandTypeCounter;

  @Captor
  private ArgumentCaptor<String> captor;

  @Before
  public void setUp() {
    this.subjectUnderTest = new OperandReportBuilder(operandTypeCounter);
  }

  @Test
  public void shouldGetTheReportResultForTransformedOperands() {
    when(operandTypeCounter.getCount(any(TransformationResult.class), captor.capture())).thenReturn(4L,7L,4L,1L,14L);

    final TransformationResult result = this.subjectUnderTest.build(TRANSFORMATION_RESULT);
    Assertions.assertThat(result).isNotNull();
    Assertions.assertThat(result).isEqualTo(TRANSFORMATION_RESULT_WITH_REPORT);

    verify(operandTypeCounter, times(5)).getCount(any(TransformationResult.class), captor.capture());
    Assertions.assertThat(captor.getAllValues()).contains("lucky","fizz","buzz","fizzbuzz","integer");
  }
}