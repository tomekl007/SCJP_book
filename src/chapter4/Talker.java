package chapter4;

import java.io.Console;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Talker{
    public static void main(String[] args) {
        Console c = System.console();
        String u = c.readLine("%s", "username: ");
        System.out.println("hello " + u);
        char[] pw; //readPassword return char[] array
        if(c != null && (pw = c.readPassword("%s", "password: ")) != null){
    // check for valid password
    }}
}

class Slice{
    public static void main(String[] args) {
        String s = "987.123456";
            double d  = 987.123456d;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(5);   //rounded number to specific fraction nr, default is 3, is
        //numbered from 1
             System.out.println(nf.format(d) + " ");
         try {

                   System.out.println(nf.parse(s));//parse not use setMaximumFractionDigits
                 } catch (Exception e) { System.out.println("got exc"); }
    }
}


class Archive{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("ab2c4d67");
             int count = 0;
             while(m.find())
                count++;
            System.out.print(count);
    }
}
class Looking{
    public static void main(String[] args) {
        String input = "1 2 a 3 45 6";
         Scanner sc = new Scanner(input);
         int x = 0;
        //do {
        /*while(sc.hasNext()){
            System.out.println(sc.next());
            if(sc.hasNextInt()){
                System.out.println("int : " + sc.nextInt());
            }
        } */


        while (sc.hasNext()) {
            if(sc.hasNextInt()){ x = sc.nextInt();
                System.out.println("int" + x);
            }
            else System.out.println(" not int " + sc.next());
        }
            /*while(sc.hasNextInt()){
                x = sc.nextInt();
                System.out.print(x + " ");
            } */

        //} while (x!=0);
    }
}

