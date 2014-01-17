package chapter5;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.Console;
public class NewConsole {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw;
        pw = c.readPassword("%s", "pw: ");
        for(char ch: pw)
            c.format("%c ", ch);
        c.format("\n");
        MyUtility mu = new MyUtility();
        while(true) {
           String name = c.readLine("%s", "input?: ");
            // #1: get a Console
            // #2: return a char[]
            // #3: format output
            // #4: return a String
            c.format("output: %s \n", mu.doStuff(name));
        }
    } }
class MyUtility {
    String doStuff(String arg1) {
// stub code
        return "result is " + arg1;
    }
}
