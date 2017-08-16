package reusing;//: reusing/reusing.PlaceSetting.java
// Combining composition & inheritance.
import static net.mindview.util.Print.*;

class Plate {
  Plate(int i) {
    print("reusing.Plate constructor");
  }
}

class DinnerPlate extends Plate {
  DinnerPlate(int i) {
    super(i);
    print("reusing.DinnerPlate constructor");
  }
}	

class Utensil {
  Utensil(int i) {
    print("reusing.Utensil constructor");
  }
}

class Spoon extends Utensil {
  Spoon(int i) {
    super(i);
    print("initialization.reusing.Spoon constructor");
  }
}

class Fork extends Utensil {
  Fork(int i) {
    super(i);
    print("reusing.Fork constructor");
  }
}	

class Knife extends Utensil {
  Knife(int i) {
    super(i);
    print("reusing.Knife constructor");
  }
}

// generics.initialization.A cultural way of doing something:
class Custom {
  Custom(int i) {
    print("reusing.Custom constructor");
  }
}	

public class PlaceSetting extends Custom {
  private Spoon sp;
  private Fork frk;
  private Knife kn;
  private DinnerPlate pl;
  public PlaceSetting(int i) {
    super(i + 1);
    sp = new Spoon(i + 2);
    frk = new Fork(i + 3);
    kn = new Knife(i + 4);
    pl = new DinnerPlate(i + 5);
    print("reusing.PlaceSetting constructor");
  }
  public static void main(String[] args) {
    PlaceSetting x = new PlaceSetting(9);
  }
} /* Output:
reusing.Custom constructor
reusing.Utensil constructor
initialization.reusing.Spoon constructor
reusing.Utensil constructor
reusing.Fork constructor
reusing.Utensil constructor
reusing.Knife constructor
reusing.Plate constructor
reusing.DinnerPlate constructor
reusing.PlaceSetting constructor
*///:~
