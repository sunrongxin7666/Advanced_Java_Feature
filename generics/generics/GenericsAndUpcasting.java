package generics;//: holding/generics.GenericsAndUpcasting.java

import java.util.*;

class GrannySmith extends generics.Apple {}
class Gala extends generics.Apple {}
class Fuji extends generics.Apple {}
class Braeburn extends generics.Apple {}

public class GenericsAndUpcasting {
  public static void main(String[] args) {
    ArrayList<generics.Apple> apples = new ArrayList<generics.Apple>();
    apples.add(new GrannySmith());
    apples.add(new Gala());
    apples.add(new Fuji());
    apples.add(new Braeburn());
    for(generics.Apple c : apples)
      System.out.println(c);
  }
} /* Output: (Sample)
generics.GrannySmith@7d772e
generics.Gala@11b86e7
generics.Fuji@35ce36
generics.Braeburn@757aef
*///:~
