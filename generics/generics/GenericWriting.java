package generics;//: generics/generics.GenericWriting.java
import generics.Fruit;

import java.util.*;

public class GenericWriting {
  static <T> void writeExact(List<T> list, T item) {
    list.add(item);
  }
  static List<generics.Apple> apples = new ArrayList<generics.Apple>();
  static List<Fruit> fruit = new ArrayList<Fruit>();
  static void f1() {
    writeExact(apples, new generics.Apple());
    // writeExact(fruit, new generics.initialization.Apple()); // Error:
    // Incompatible types: found generics.Fruit, required generics.initialization.Apple
  }
  static <T> void
  writeWithWildcard(List<? super T> list, T item) {
    list.add(item);
  }	
  static void f2() {
    writeWithWildcard(apples, new generics.Apple());
    writeWithWildcard(fruit, new generics.Apple());
  }
  public static void main(String[] args) { f1(); f2(); }
} ///:~
