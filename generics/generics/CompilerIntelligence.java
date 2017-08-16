package generics;//: generics/generics.CompilerIntelligence.java
import generics.Fruit;

import java.util.*;

public class CompilerIntelligence {
  public static void main(String[] args) {
    List<? extends Fruit> flist =
      Arrays.asList(new generics.Apple());
    generics.Apple a = (generics.Apple)flist.get(0); // No warning
    flist.contains(new generics.Apple()); // Argument is 'Object'
    flist.indexOf(new generics.Apple()); // Argument is 'Object'
  }
} ///:~
