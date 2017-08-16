package generics;//: generics/generics.OrdinaryArguments.java

class OrdinarySetter {
  void set(generics.Base base) {
    System.out.println("generics.OrdinarySetter.set(generics.Base)");
  }
}

class DerivedSetter extends OrdinarySetter {
  void set(Derived derived) {
    System.out.println("generics.DerivedSetter.set(generics.Derived)");
  }
}	

public class OrdinaryArguments {
  public static void main(String[] args) {
    generics.Base base = new generics.Base();
    Derived derived = new Derived();
    DerivedSetter ds = new DerivedSetter();
    ds.set(derived);
    ds.set(base); // Compiles: overloaded, not overridden!
  }
} /* Output:
generics.DerivedSetter.set(generics.Derived)
generics.OrdinarySetter.set(generics.Base)
*///:~
