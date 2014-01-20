package chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/19/14
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class StaticNest {


}

class BigOuter {
    static class Nest {void go() { System.out.println("hi"); } }
}
class Broom {
    static class B2 {void goB2() { System.out.println("hi 2"); } }
    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest();   // both class names !!!!!
        n.go();
        B2 b2 = new B2();
        b2.goB2(); }
}
