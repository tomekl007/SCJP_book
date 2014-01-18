package chapter5and6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class MatcherPlaying {

    public static void main(String[] args) {



     /*   String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";

        String patternString = "This is the";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("lookingAt = " + matcher.lookingAt()); //look not to whole text
        System.out.println("matches   = " + matcher.matches());*/


        /*String text    =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }    */

        /*String text    =
                "John writes about this, and John writes about that," +
                        " and John writes about everything. "
                ;

        String patternString1 = "(John)";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(1));
        }
            */

       /* String text    =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything."
                ;

        String patternString1 = "(John) (.+?) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(1) +
                    " "       + matcher.group(2));
        }  */
        //group inside group
        String text    =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything."
                ;

        String patternString1 = "((John) (.+?)) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: <"  + matcher.group(1) +
                    "> <"       + matcher.group(2) +
                    "> <"       + matcher.group(3) + ">");
        }
        LinkedList l ;
        ArrayList s;
        Vector v;

    }
}
