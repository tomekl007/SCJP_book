package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
class ScanNext {
    public static void main(String [] args) {
        boolean b2, b;
        int i;
        String s, hits = " ";
        Scanner s1 = new Scanner("1 true 34 hi");
        Scanner s2 = new Scanner("1 true 34 hi");
        while(b = s1.hasNext()) {
            s = s1.next();
            hits += "s";
        }
        while(b = s2.hasNext()) {
            if (s2.hasNextInt()) {
                i = s2.nextInt();
                hits += "i";
            } else if (s2.hasNextBoolean()) {
                b2 = s2.nextBoolean();  hits += "b";
            } else {
                s2.next();
                hits += "s2";
            }
        }
        System.out.println("hits " + hits);
    }
}
