package generics;//: generics/generics.GenericReading.java
import generics.Fruit;

import java.util.*;

public class GenericReading {
  static <T> T readExact(List<T> list) {
    return list.get(0);
  }
  static List<generics.Apple> apples = Arrays.asList(new generics.Apple());
  static List<Fruit> fruit = Arrays.asList(new Fruit());
  // generics.initialization.A static method adapts to each call:
  static void f1() {
    generics.Apple a = readExact(apples);
    Fruit f = readExact(fruit);
    f = readExact(apples);
  }
  // If, however, you have a class, then its type is
  // established when the class is instantiated:
  static class Reader<T> {
    T readExact(List<T> list) { return list.get(0); }
  }	
  static void f2() {
    Reader<Fruit> fruitReader = new Reader<Fruit>();
    Fruit f = fruitReader.readExact(fruit);
    // generics.Fruit a = fruitReader.readExact(apples); // Error:
    // readExact(List<generics.Fruit>) cannot be
    // applied to (List<generics.initialization.Apple>).
  }
  static class CovariantReader<T> {
    T readCovariant(List<? extends T> list) {
      return list.get(0);
    }
  }
  static void f3() {
    CovariantReader<Fruit> fruitReader =
      new CovariantReader<Fruit>();
    Fruit f = fruitReader.readCovariant(fruit);
    Fruit a = fruitReader.readCovariant(apples);
  }	
  public static void main(String[] args) {
    f1(); f2(); f3();
  }
} ///:~
