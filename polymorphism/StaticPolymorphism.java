//: polymorphism/StaticPolymorphism.java
// Static methods are not polymorphic.

class StaticSuper {
  public static String staticGet() {
    return "generics.Base staticGet()";
  }
  public String dynamicGet() {
    return "generics.Base dynamicGet()";
  }
}

class StaticSub extends StaticSuper {
  public static String staticGet() {
    return "generics.Derived staticGet()";
  }
  public String dynamicGet() {
    return "generics.Derived dynamicGet()";
  }
}

public class StaticPolymorphism {
  public static void main(String[] args) {
    StaticSuper sup = new StaticSub(); // Upcast
    System.out.println(sup.staticGet());
    System.out.println(sup.dynamicGet());
  }
} /* Output:
generics.Base staticGet()
generics.Derived dynamicGet()
*///:~
