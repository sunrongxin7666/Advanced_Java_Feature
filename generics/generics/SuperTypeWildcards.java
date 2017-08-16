package generics;//: generics/generics.SuperTypeWildcards.java
import generics.Jonathan;

import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super generics.Apple> apples) {
    apples.add(new generics.Apple());
    apples.add(new Jonathan());
    // apples.add(new generics.Fruit()); // Error
  }
} ///:~
