package typeinfo.pets;//: typeinfo/typeinfo.pets.polymorphism.shape.Shapes.java
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "typeinfo.pets.Circle"; }
}

class Square extends Shape {
  public String toString() { return "typeinfo.pets.Square"; }
}

class Triangle extends Shape {
  public String toString() { return "typeinfo.pets.Triangle"; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
      shape.draw();
  }
} /* Output:
typeinfo.pets.Circle.draw()
typeinfo.pets.Square.draw()
typeinfo.pets.Triangle.draw()
*///:~
