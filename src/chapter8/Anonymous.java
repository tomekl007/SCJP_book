package chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/19/14
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Anonymous {


}

class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}
class Food {
    Popcorn p = new Popcorn() {
        @Override
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
}


class Food2 {
    Popcorn p = new Popcorn() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
    public void popIt() {
        p.pop();     // OK, Popcorn has a pop() method
        //p.sizzle();  // Not Legal! Popcorn does not have sizzle()
    } }

interface Cookable {
    public void cook();
}
class Food3 {
    Cookable c = new Cookable() {//notice new <Interface>
        @Override
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    }; }
