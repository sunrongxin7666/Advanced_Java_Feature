package typeinfo.pets;//: typeinfo/generics.typeinfo.pets.Robot.java
import java.util.*;
import net.mindview.util.*;

public interface Robot {
  String name();
  String model();
  List<Operation> operations();
  class Test {
    public static void test(Robot r) {
      if(r instanceof Null)
        System.out.println("[Null generics.typeinfo.pets.Robot]");
      System.out.println("generics.typeinfo.pets.Robot name: " + r.name());
      System.out.println("generics.typeinfo.pets.Robot model: " + r.model());
      for(Operation operation : r.operations()) {
        System.out.println(operation.description());
        operation.command();
      }
    }
  }
} ///:~
