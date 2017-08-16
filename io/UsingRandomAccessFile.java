//: io/UsingRandomAccessFile.java
import java.io.*;

public class UsingRandomAccessFile {
  static String file = "rtest.dat";
  static void display() throws IOException {
    RandomAccessFile rf = new RandomAccessFile(file, "r");
    for(int i = 0; i < 7; i++)
      System.out.println(
        "operators.Value " + i + ": " + rf.readDouble());
    System.out.println(rf.readUTF());
    rf.close();
  }
  public static void main(String[] args)
  throws IOException {
    RandomAccessFile rf = new RandomAccessFile(file, "rw");
    for(int i = 0; i < 7; i++)
      rf.writeDouble(i*1.414);
    rf.writeUTF("The end of the file");
    rf.close();
    display();
    rf = new RandomAccessFile(file, "rw");
    rf.seek(5*8);
    rf.writeDouble(47.0001);
    rf.close();
    display();
  }
} /* Output:
operators.Value 0: 0.0
operators.Value 1: 1.414
operators.Value 2: 2.828
operators.Value 3: 4.242
operators.Value 4: 5.656
operators.Value 5: 7.069999999999999
operators.Value 6: 8.484
The end of the file
operators.Value 0: 0.0
operators.Value 1: 1.414
operators.Value 2: 2.828
operators.Value 3: 4.242
operators.Value 4: 5.656
operators.Value 5: 47.0001
operators.Value 6: 8.484
The end of the file
*///:~
