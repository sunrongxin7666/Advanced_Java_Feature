package generics;//: generics/generics.GenericsAndCovariance.java
import generics.Fruit;
import generics.Apply;

import java.util.*;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance:
    List<? extends Fruit> flist = new ArrayList<Apple>();
    // Compile Error: can't add any type of object:
    // flist.add(new generics.initialization.Apple());
    // flist.add(new generics.Fruit());
    // flist.add(new Object());
    flist.add(null); // Legal but uninteresting
    // We know that it returns at least generics.Fruit:
    Fruit f = flist.get(0);
  }
} ///:~
