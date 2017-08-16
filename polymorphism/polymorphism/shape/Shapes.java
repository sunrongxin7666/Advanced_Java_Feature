package polymorphism.shape;//: polymorphism/typeinfo.pets.polymorphism.shape.Shapes.java
// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s)
      shp.draw();
  }
} /* Output:
typeinfo.Triangle.draw()
typeinfo.Triangle.draw()
typeinfo.Square.draw()
typeinfo.Triangle.draw()
typeinfo.Square.draw()
typeinfo.Triangle.draw()
typeinfo.Square.draw()
typeinfo.Triangle.draw()
typeinfo.Circle.draw()
*///:~
