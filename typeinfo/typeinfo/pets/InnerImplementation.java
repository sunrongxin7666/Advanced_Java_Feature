package typeinfo.pets;//: typeinfo/InnerImplementation.java
// Private inner classes can't hide from reflection.
import typeinfo.interfacea.*;
import static net.mindview.util.Print.*;

class InnerA {
  private static class C implements A {
    public void f() { print("public generics.C.f()"); }
    public void g() { print("public generics.C.g()"); }
    void u() { print("package generics.C.u()"); }
    protected void v() { print("protected generics.C.v()"); }
    private void w() { print("private generics.C.w()"); }
  }
  public static A makeA() { return new C(); }
}	

public class InnerImplementation {
  public static void main(String[] args) throws Exception {
    A a = InnerA.makeA();
    a.f();
    System.out.println(a.getClass().getName());
    // Reflection still gets into the private class:
    HiddenImplementation.callHiddenMethod(a, "g");
    HiddenImplementation.callHiddenMethod(a, "u");
    HiddenImplementation.callHiddenMethod(a, "v");
    HiddenImplementation.callHiddenMethod(a, "w");
  }
} /* Output:
public generics.C.f()
InnerA$generics.C
public generics.C.g()
package generics.C.u()
protected generics.C.v()
private generics.C.w()
*///:~
