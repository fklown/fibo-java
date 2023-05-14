package io.karlzw.fibojava.fibonacci;

public class FibonacciSequence {
  public Integer getNthElement(Integer elementIndex) {
    if (elementIndex <= 0) return 0;
    if (elementIndex <= 2) return 1;

    return getNthElement(elementIndex - 1) + getNthElement(elementIndex - 2);
  }
}
