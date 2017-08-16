//: reusing/CADSystem.java
// Ensuring proper cleanup.
package reusing;
import static net.mindview.util.Print.*;

class Shape {
  Shape(int i) { print("typeinfo.Shape constructor"); }
  void dispose() { print("typeinfo.Shape dispose"); }
}

class Circle extends Shape {
  Circle(int i) {
    super(i);
    print("Drawing typeinfo.Circle");
  }
  void dispose() {
    print("Erasing typeinfo.Circle");
    super.dispose();
  }
}

class Triangle extends Shape {
  Triangle(int i) {
    super(i);
    print("Drawing typeinfo.Triangle");
  }
  void dispose() {
    print("Erasing typeinfo.Triangle");
    super.dispose();
  }
}

class Line extends Shape {
  private int start, end;
  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    print("Drawing Line: " + start + ", " + end);
  }
  void dispose() {
    print("Erasing Line: " + start + ", " + end);
    super.dispose();
  }
}

public class CADSystem extends Shape {
  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];
  public CADSystem(int i) {
    super(i + 1);
    for(int j = 0; j < lines.length; j++)
      lines[j] = new Line(j, j*j);
    c = new Circle(1);
    t = new Triangle(1);
    print("Combined constructor");
  }
  public void dispose() {
    print("CADSystem.dispose()");
    // The order of cleanup is the reverse
    // of the order of initialization:
    t.dispose();
    c.dispose();
    for(int i = lines.length - 1; i >= 0; i--)
      lines[i].dispose();
    super.dispose();
  }
  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);
    try {
      // Code and exception handling...
    } finally {
      x.dispose();
    }
  }
} /* Output:
typeinfo.Shape constructor
typeinfo.Shape constructor
Drawing Line: 0, 0
typeinfo.Shape constructor
Drawing Line: 1, 1
typeinfo.Shape constructor
Drawing Line: 2, 4
typeinfo.Shape constructor
Drawing typeinfo.Circle
typeinfo.Shape constructor
Drawing typeinfo.Triangle
Combined constructor
CADSystem.dispose()
Erasing typeinfo.Triangle
typeinfo.Shape dispose
Erasing typeinfo.Circle
typeinfo.Shape dispose
Erasing Line: 2, 4
typeinfo.Shape dispose
Erasing Line: 1, 1
typeinfo.Shape dispose
Erasing Line: 0, 0
typeinfo.Shape dispose
typeinfo.Shape dispose
*///:~
