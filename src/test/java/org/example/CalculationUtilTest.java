package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculationUtilTest {

  CalculationUtil calculationUtil;

  @BeforeEach
  void setUp() {
    calculationUtil = new CalculationUtil();
  }

  @Test
  @DisplayName("success case")
void successCase() {
    assertEquals(25, calculationUtil.square(5));
    assertEquals(16, calculationUtil.square(4));
    assertEquals(8, calculationUtil.square(3));
  }


}