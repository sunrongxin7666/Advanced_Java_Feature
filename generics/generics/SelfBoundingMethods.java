package generics;//: generics/generics.SelfBoundingMethods.java

import generics.SelfBounded;

public class SelfBoundingMethods {
  static <T extends SelfBounded<T>> T f(T arg) {
    return arg.set(arg).get();
  }
  public static void main(String[] args) {
    generics.A a = f(new generics.A());
  }
} ///:~
