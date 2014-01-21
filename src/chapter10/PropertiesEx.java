package chapter10;

import java.util.Properties;
import static java.lang.System.*;
/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesEx {

}

class TestProps {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("myProp", "myValue");
        p.list(System.out);
    } }

