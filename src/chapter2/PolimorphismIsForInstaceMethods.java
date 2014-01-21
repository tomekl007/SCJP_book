package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PolimorphismIsForInstaceMethods {
}
class Mammal {
 String name = "furry ";
 String makeNoise() { return "generic noise"; }
 }
 class Zebra extends Mammal {
       String name = "stripes ";
       String makeNoise() { return "bray"; }
     }
class ZooKeeper {


public static void main(String[] args) { new ZooKeeper().go(); }
        void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
}
}

