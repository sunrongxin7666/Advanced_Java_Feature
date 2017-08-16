package typeinfo.pets;//: typeinfo/AnonymousImplementation.java
// Anonymous inner classes can't hide from reflection.
import typeinfo.interfacea.*;
import static net.mindview.util.Print.*;

class AnonymousA {
  public static A makeA() {
    return new A() {
      public void f() { print("public generics.C.f()"); }
      public void g() { print("public generics.C.g()"); }
      void u() { print("package generics.C.u()"); }
      protected void v() { print("protected generics.C.v()"); }
      private void w() { print("private generics.C.w()"); }
    };
  }
}	

public class AnonymousImplementation {
  public static void main(String[] args) throws Exception {
    A a = AnonymousA.makeA();
    a.f();
    System.out.println(a.getClass().getName());
    // Reflection still gets into the anonymous class:
    HiddenImplementation.callHiddenMethod(a, "g");
    HiddenImplementation.callHiddenMethod(a, "u");
    HiddenImplementation.callHiddenMethod(a, "v");
    HiddenImplementation.callHiddenMethod(a, "w");
  }
} /* Output:
public generics.C.f()
AnonymousA$1
public generics.C.g()
package generics.C.u()
protected generics.C.v()
private generics.C.w()
*///:~
