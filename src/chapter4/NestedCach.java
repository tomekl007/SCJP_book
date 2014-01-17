package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/13/14
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class NestedCach {

        static String s = "-";
        public static void main(String[] args) {
            try {
                throw new Exception();
            } catch (Exception e) {
                try {
                    try { throw new Exception();
                    } catch (Exception ex) { s += "ic "; }
                    throw new Exception(); }
                catch (Exception x) { s += "mc "; }
                finally { s += "mf "; }
            } finally { s += "of "; }
            System.out.println(s);
        }
}
