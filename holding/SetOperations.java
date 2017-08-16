//: holding/SetOperations.java
import java.util.*;
import static net.mindview.util.Print.*;

public class SetOperations {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<String>();
    Collections.addAll(set1,
      "generics.initialization.A generics.typeinfo.B generics.C generics.D E generics.F G H I J K L".split(" "));
    set1.add("M");
    print("H: " + set1.contains("H"));
    print("N: " + set1.contains("N"));
    Set<String> set2 = new HashSet<String>();
    Collections.addAll(set2, "H I J K L".split(" "));
    print("set2 in set1: " + set1.containsAll(set2));
    set1.remove("H");
    print("set1: " + set1);
    print("set2 in set1: " + set1.containsAll(set2));
    set1.removeAll(set2);
    print("set2 removed from set1: " + set1);
    Collections.addAll(set1, "X Y Z".split(" "));
    print("'X Y Z' added to set1: " + set1);
  }
} /* Output:
H: true
N: false
set2 in set1: true
set1: [generics.D, K, generics.C, generics.typeinfo.B, L, G, I, M, generics.initialization.A, generics.F, J, E]
set2 in set1: false
set2 removed from set1: [generics.D, generics.C, generics.typeinfo.B, G, M, generics.initialization.A, generics.F, E]
'X Y Z' added to set1: [Z, generics.D, generics.C, generics.typeinfo.B, G, M, generics.initialization.A, generics.F, Y, X, E]
*///:~
