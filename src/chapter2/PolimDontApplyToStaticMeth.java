package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class PolimDontApplyToStaticMeth {
}

 class Tenor extends Singer {

    public static String sing() { return "fa"; }
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
 }
class Singer { public static String sing() { return "la"; } }
