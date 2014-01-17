package chapter5and6;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
class SuperNotSerial {
    public static void main(String [] args) {
        Dog d = new Dog(35, "Fido");
        System.out.println("before: " + d.name + " "
                + d.weight);
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) { e.printStackTrace(); }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Dog) ois.readObject();
            ois.close();
        } catch (Exception e) { e.printStackTrace(); }
        System.out.println("after:  " + d.name + " "
                + d.weight);
    } }


/*If you are a serializable class, but your superclass is NOT serializable, then any instance variables you
 INHERIT from that superclass will be reset to the values they were given during the original construction
 of the object. This is because the non- serializable class constructor WILL run!
In fact, every constructor ABOVE the first non-serializable class constructor will also run, no matter
what, because once the first super constructor is invoked, (during deserialization), it of course invokes
 its super constructor and so on up the inheritance tree.*/

class Dog extends Animal implements Serializable {
    String name;

    Dog(int w, String n) {
        weight = w;
        name = n;
    } }
class Animal {
    int weight = 42;
}