//: typeinfo/FamilyVsExactType.java
// The difference between instanceof and class
package typeinfo.pets;
import static net.mindview.util.Print.*;

class Base {}
class Derived extends Base {}	

public class FamilyVsExactType {
  static void test(Object x) {
    print("Testing x of type " + x.getClass());
    print("x instanceof generics.Base " + (x instanceof Base));
    print("x instanceof generics.Derived "+ (x instanceof Derived));
    print("generics.Base.isInstance(x) "+ Base.class.isInstance(x));
    print("generics.Derived.isInstance(x) " +
      Derived.class.isInstance(x));
    print("x.getClass() == generics.Base.class " +
      (x.getClass() == Base.class));
    print("x.getClass() == generics.Derived.class " +
      (x.getClass() == Derived.class));
    print("x.getClass().equals(generics.Base.class)) "+
      (x.getClass().equals(Base.class)));
    print("x.getClass().equals(generics.Derived.class)) " +
      (x.getClass().equals(Derived.class)));
  }
  public static void main(String[] args) {
    test(new Base());
    test(new Derived());
  }	
} /* Output:
Testing x of type class typeinfo.generics.Base
x instanceof generics.Base true
x instanceof generics.Derived false
generics.Base.isInstance(x) true
generics.Derived.isInstance(x) false
x.getClass() == generics.Base.class true
x.getClass() == generics.Derived.class false
x.getClass().equals(generics.Base.class)) true
x.getClass().equals(generics.Derived.class)) false
Testing x of type class typeinfo.generics.Derived
x instanceof generics.Base true
x instanceof generics.Derived true
generics.Base.isInstance(x) true
generics.Derived.isInstance(x) true
x.getClass() == generics.Base.class false
x.getClass() == generics.Derived.class true
x.getClass().equals(generics.Base.class)) false
x.getClass().equals(generics.Derived.class)) true
*///:~
