package io.karlzw.fibojava.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSequenceUnitTest {

  private static final int ONE = 1;
  private static final int THREE = 3;
  private static final int TWO = 2;
  private static final int ZERO = 0;
  private static final int FIVE = 5;

  private final FibonacciSequence sequence = new FibonacciSequence();

  @Test
  void sequenceElementNumber0ShouldBe0() {
    assertEquals(ZERO, sequence.getNthElement(0));
    assertEquals(ZERO, sequence.getNthElement(-89));
  }

  @Test
  void sequenceElementNumber1ShouldBe1() {
    assertEquals(ONE, sequence.getNthElement(1));
  }

  @Test
  void sequenceElementNumber2ShouldBe1() {
    assertEquals(ONE, sequence.getNthElement(2));
  }

  @Test
  void sequenceElementNumber3ShouldBe1() {
    assertEquals(TWO, sequence.getNthElement(3));
  }

  @Test
  void sequenceElementNumber4ShouldBe2() {
    assertEquals(THREE, sequence.getNthElement(4));
  }

  @Test
  void sequenceElementNumber5ShouldBe3() {
    assertEquals(FIVE, sequence.getNthElement(5));
  }

  @Test
  void sequenceElementNumber46ShouldBe1836311903() {
    assertEquals(1836311903, sequence.getNthElement(46));
  }
}