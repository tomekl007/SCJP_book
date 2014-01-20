package chapter8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/20/14
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class SelfTest {
}
 abstract class AbstractTest {
    public int getNum() {
        return 45; }
    public abstract class Bar {
        public int getNum() {
            return 38; }
    }
    public static void main(String[] args) {
        AbstractTest t = new AbstractTest() {
            public int getNum() {
                return 22; }
        };
        AbstractTest.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            } };
        System.out.println(f.getNum() + " " + t.getNum());
    }}

class Tour {

    public static void main(String[] args) {
        Cathedrad c = new Cathedrad();
        Cathedrad.Sanc s = c.new Sanc();
                 s.go();
        //Cathedrad.Sanc s2 = new Cathedrad().new Sanc();
    }
   }
 class Cathedrad{
     class Sanc{
         void go() { System.out.println("spooky"); }
     }
 }


class A { void m() { System.out.println("outer"); } }

  class TestInners {
     public static void main(String[] args) {
         new TestInners().go();
  }
    void go(){
        new A().m();
        class A {
            void m() {
                System.out.println("inneR");}
        }
    }

   class A { void m() { System.out.println("middle"); } }
 }

class Pockets {

    public static void main(String[] args) {
        String[] sa = {"nickel", "button", "key", "lint"};
        Sorter s = new Sorter();
        for(String s2: sa) System.out.print(s2 + " ");
        Arrays.sort(sa, s);
        System.out.println();
            for(String s2: sa) System.out.print(s2 + " ");
    }



static class Sorter implements Comparator<String> {
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
}



