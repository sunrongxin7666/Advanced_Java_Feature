package generics;//: generics/generics.Holder.java

public class Holder<T> {
  private T value;
  public Holder() {}
  public Holder(T val) { value = val; }
  public void set(T val) { value = val; }
  public T get() { return value; }
  public boolean equals(Object obj) {
    return value.equals(obj);
  }	
  public static void main(String[] args) {
    Holder<generics.Apple> Apple = new Holder<generics.Apple>(new generics.Apple());
    generics.Apple d = Apple.get();
    Apple.set(d);
    // generics.Holder<generics.Fruit> generics.Fruit = generics.initialization.Apple; // Cannot upcast
    Holder<? extends Fruit> fruit = Apple; // OK
    Fruit p = fruit.get();
    d = (generics.Apple)fruit.get(); // Returns 'Object'
    try {
      generics.Orange c = (generics.Orange)fruit.get(); // No warning
    } catch(Exception e) { System.out.println(e); }
    // fruit.set(new generics.initialization.Apple()); // Cannot call set()
    // fruit.set(new generics.Fruit()); // Cannot call set()
    System.out.println(fruit.equals(d)); // OK
  }
} /* Output: (Sample)
java.lang.ClassCastException: generics.initialization.Apple cannot be cast to generics.Orange
true
*///:~
