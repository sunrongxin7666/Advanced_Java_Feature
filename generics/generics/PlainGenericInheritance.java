package generics;//: generics/generics.PlainGenericInheritance.java

class GenericSetter<T> { // Not self-bounded
  void set(T arg){
    System.out.println("generics.GenericSetter.set(generics.Base)");
  }
}

class DerivedGS extends GenericSetter<generics.Base> {
  void set(Derived derived){
    System.out.println("generics.DerivedGS.set(generics.Derived)");
  }
}	

public class PlainGenericInheritance {
  public static void main(String[] args) {
    generics.Base base = new generics.Base();
    Derived derived = new Derived();
    DerivedGS dgs = new DerivedGS();
    dgs.set(derived);
    dgs.set(base); // Compiles: overloaded, not overridden!
  }
} /* Output:
generics.DerivedGS.set(generics.Derived)
generics.GenericSetter.set(generics.Base)
*///:~
