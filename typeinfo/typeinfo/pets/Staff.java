package typeinfo.pets;//: typeinfo/typeinfo.pets.Staff.java

import java.util.*;
import typeinfo.Person;
public class Staff extends ArrayList<Position> {
  public void add(String title, Person person) {
    add(new Position(title, person));
  }
  public void add(String... titles) {
    for(String title : titles)
      add(new Position(title));
  }
  public Staff(String... titles) { add(titles); }
  public boolean positionAvailable(String title) {
    for(Position position : this)
      if(position.getTitle().equals(title) &&
         position.getPerson() == Person.NULL)
        return true;
    return false;
  }	
  public void fillPosition(String title, Person hire) {
    for(Position position : this)
      if(position.getTitle().equals(title) &&
         position.getPerson() == Person.NULL) {
        position.setPerson(hire);
        return;
      }
    throw new RuntimeException(
      "typeinfo.pets.Position " + title + " not available");
  }	
  public static void main(String[] args) {
    Staff staff = new Staff("President", "CTO",
      "Marketing Manager", "Product Manager",
      "Project Lead", "Software Engineer",
      "Software Engineer", "Software Engineer",
      "Software Engineer", "Test Engineer",
      "Technical Writer");
    staff.fillPosition("President",
      new Person("Me", "Last", "The Top, Lonely At"));
    staff.fillPosition("Project Lead",
      new Person("Janet", "Planner", "The Burbs"));
    if(staff.positionAvailable("Software Engineer"))
      staff.fillPosition("Software Engineer",
        new Person("Bob", "Coder", "Bright Light City"));
    System.out.println(staff);
  }
} /* Output:	
[typeinfo.pets.Position: President initialization.typeinfo.xml.Person: Me Last The Top, Lonely At, typeinfo.pets.Position: CTO NullPerson, typeinfo.pets.Position: Marketing Manager NullPerson, typeinfo.pets.Position: Product Manager NullPerson, typeinfo.pets.Position: Project Lead initialization.typeinfo.xml.Person: Janet Planner The Burbs, typeinfo.pets.Position: Software Engineer initialization.typeinfo.xml.Person: Bob Coder Bright Light City, typeinfo.pets.Position: Software Engineer NullPerson, typeinfo.pets.Position: Software Engineer NullPerson, typeinfo.pets.Position: Software Engineer NullPerson, typeinfo.pets.Position: Test Engineer NullPerson, typeinfo.pets.Position: Technical Writer NullPerson]
*///:~
