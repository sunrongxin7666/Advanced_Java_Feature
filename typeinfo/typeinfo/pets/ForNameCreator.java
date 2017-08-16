//: typeinfo/typeinfo.pets/ForNameCreator.java
package typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "typeinfo.typeinfo.pets.Mutt",
    "typeinfo.typeinfo.pets.Pug",
    "typeinfo.typeinfo.pets.EgyptianMau",
    "typeinfo.typeinfo.pets.Manx",
    "typeinfo.typeinfo.pets.Cymric",
    "typeinfo.typeinfo.pets.Rat",
    "typeinfo.typeinfo.pets.Mouse",
    "typeinfo.typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
