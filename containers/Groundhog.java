//: containers/Groundhog.java
// Looks plausible, but doesn't work as a HashMap key.

public class Groundhog {
  protected int number;
  public Groundhog(int n) { number = n; }
  public String toString() {
    return "Groundhog #" + number;
  }

//  @Override
//  public int hashCode() {
//    return number;
//  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Groundhog
            && ((Groundhog) o).number==this.number;
  }
} ///:~
