//: containers/MapDataTest.java
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

class Letters implements Generator<Pair<Integer,String>>,
  Iterable<Integer> {
  private int size = 9;
  private int number = 1;
  private char letter = 'A';
  public Pair<Integer,String> next() {
    return new Pair<Integer,String>(
      number++, "" + letter++);
  }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public Integer next() { return number++; }
      public boolean hasNext() { return number < size; }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
}

public class MapDataTest {
  public static void main(String[] args) {
    // Pair Generator:
    print(MapData.map(new Letters(), 11));
    // Two separate generators:
    print(MapData.map(new CountingGenerator.Character(),
      new RandomGenerator.String(3), 8));
    // generics.initialization.A key Generator and a single value:
    print(MapData.map(new CountingGenerator.Character(),
      "operators.Value", 6));
    // An Iterable and a value Generator:
    print(MapData.map(new Letters(),
      new RandomGenerator.String(3)));
    // An Iterable and a single value:
    print(MapData.map(new Letters(), "Pop"));
  }
} /* Output:
{1=generics.initialization.A, 2=generics.typeinfo.B, 3=generics.C, 4=generics.D, 5=E, 6=generics.F, 7=G, 8=H, 9=I, 10=J, 11=K}
{a=YNz, b=brn, c=yGc, d=FOW, e=ZnT, f=cQr, g=Gse, h=GZM}
{a=operators.Value, b=operators.Value, c=operators.Value, d=operators.Value, e=operators.Value, f=operators.Value}
{1=mJM, 2=RoE, 3=suE, 4=cUO, 5=neO, 6=EdL, 7=smw, 8=HLG}
{1=Pop, 2=Pop, 3=Pop, 4=Pop, 5=Pop, 6=Pop, 7=Pop, 8=Pop}
*///:~
