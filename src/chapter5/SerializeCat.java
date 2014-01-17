package chapter5;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
class Cat implements Serializable {
    String name ;

    Cat(String name) {
        this.name = name;
    }
} // 1
public class SerializeCat {
    public static void main(String[] args) {
        Cat c = new Cat("nyon");  // 2
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(c); // 3
            os.close();
        } catch (Exception e) { e.printStackTrace(); }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            c = (Cat) ois.readObject(); // 4
            ois.close();
            System.out.println(c.name);
        } catch (Exception e) { e.printStackTrace(); }
    }
}

//

class Keyboard { }
 class Computer implements Serializable {
private Keyboard k = new Keyboard();  //computer has a keybor, so keyboard must implements Serializable
    public static void main(String[] args) {
        Computer c = new Computer();
        c.storeIt(c);
    }
    void storeIt(Computer c) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("myFile"));
            os.writeObject(c);
            os.close();
            System.out.println("done");
        } catch (Exception x) {System.out.println("exc"); }
    }
}