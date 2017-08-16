//: generics/GenericVarargs.java
import java.util.*;
import java.util.List;

public class GenericVarargs {
  public static <T> List<T> makeList(T... args) {
    List<T> result = new ArrayList<T>();
    for(T item : args)
      result.add(item);
    return result;
  }
  public static void main(String[] args) {
    List<String> ls = makeList("generics.initialization.A");
    System.out.println(ls);
    ls = makeList("generics.initialization.A", "generics.typeinfo.B", "generics.C");
    System.out.println(ls);
    ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
} /* Output:
[generics.initialization.A]
[generics.initialization.A, generics.typeinfo.B, generics.C]
[, generics.initialization.A, generics.typeinfo.B, generics.C, generics.D, E, generics.F, generics.F, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
*///:~
