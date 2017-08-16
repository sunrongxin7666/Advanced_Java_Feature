package generics;

import typeinfo.pets.Dog;

import static net.mindview.util.Print.print;

public class PerformingDog extends Dog implements Performs {
  public void speak() { print("Woof!"); }
  public void sit() { print("Sitting"); }
  public void reproduce() {}
}
