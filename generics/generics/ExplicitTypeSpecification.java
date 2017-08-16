package generics;//: generics/generics.ExplicitTypeSpecification.java
import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<initialization.Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<initialization.Person, List<Pet>>map());
  }
} ///:~
